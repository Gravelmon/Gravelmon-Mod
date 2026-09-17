#!/usr/bin/env node
const { execSync } = require('child_process');
const crypto = require('node:crypto');
const domain = process.env.GRAVELMON_API_DOMAIN;
const token = process.env.POKEMON_STATUS_INTERNAL_TOKEN;
const prNumber = Number(process.env.PR_NUMBER);
const [before, after] = process.argv.slice(2);

if (!domain || !token) {
    console.error('Missing GRAVELMON_API_DOMAIN or POKEMON_STATUS_INTERNAL_TOKEN.');
    process.exit(1);
}

function sh(cmd) {
    return execSync(cmd, { encoding: 'utf8' }).trim();
}

function readJsonAt(ref, path) {
    try {
        return JSON.parse(sh(`git show ${ref}:"${path}"`));
    } catch {
        return { entries: [] };
    }
}

// A brand-new branch's "before" is all zeros; there is nothing to diff against.
const ZERO_SHA = '0000000000000000000000000000000000000000';
const diffBase = before && before !== ZERO_SHA ? before : `${after}~1`;

const touched = sh(`git diff --name-only ${diffBase} ${after} -- '**/credits/*/*.json'`)
    .split('\n')
    .filter(Boolean);

if (touched.length === 0) {
    console.log('No credits files changed in this push; nothing to sync.');
    process.exit(0);
}

// Group what this push actually added, per contributor login, per form.
const awardsByLogin = new Map();
const touchedIdentifiers = new Set();

for (const path of touched) {
    const beforeFile = readJsonAt(diffBase, path);
    const afterFile = readJsonAt(after, path);
    const priorCount = (beforeFile.entries ?? []).length;
    const newEntries = (afterFile.entries ?? []).slice(priorCount);
    if (newEntries.length === 0) continue;

    for (const entry of newEntries) {
        const aspects =
            entry.formAspects && entry.formAspects.length > 0
                ? `#${entry.formAspects.join(',')}`
                : '';
        const identifier = `${afterFile.game}#${afterFile.pokemon}${aspects}`;
        touchedIdentifiers.add(identifier);

        const login = entry.contributor.login;
        const newAnimations = (entry.animations ?? []).length;
        if (!awardsByLogin.has(login)) awardsByLogin.set(login, new Map());
        const perForm = awardsByLogin.get(login);
        perForm.set(identifier, (perForm.get(identifier) ?? 0) + newAnimations);
    }
}

function sha256Hex(value) {
    return crypto.createHash('sha256').update(value, 'utf8').digest('hex');
}

async function post(path, body) {
    const jsonBody = JSON.stringify(body);
    const response = await fetch(`${domain}${path}`, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
            'X-Gravelmon-Token': `Bearer ${token}`,
            'x-amz-content-sha256': sha256Hex(jsonBody),
        },
        body: jsonBody,
    });
    const text = await response.text();
    if (!response.ok) {
        throw new Error(`${path} -> ${response.status}: ${text}`);
    }
    console.log(`${path} -> ${response.status}: ${text}`);
    const parsed = JSON.parse(text);
    const failed = (parsed.updated ?? []).filter((r) => r.status === 'error');
    if (failed.length > 0) {
        throw new Error(`${path} reported per-item errors: ${JSON.stringify(failed)}`);
    }
    return parsed;
}

(async () => {
    await post('/api/internal/pokemon-status', { identifiers: [...touchedIdentifiers] });

    if (!Number.isFinite(prNumber)) {
        console.log('No merged PR number resolved for this commit; skipping point awards.');
        return;
    }

    for (const [login, perForm] of awardsByLogin) {
        await post('/api/internal/award-points', {
            login,
            pullRequestNumber: prNumber,
            submissions: [...perForm.entries()].map(([identifier, newAnimations]) => ({
                identifier,
                newAnimations,
            })),
        });
    }
})().catch((err) => {
    console.error(err);
    process.exit(1);
});
