#!/usr/bin/env node
const { execSync } = require('child_process');
const crypto = require('node:crypto');
const domain = process.env.GRAVELMON_API_DOMAIN;
const token = process.env.POKEMON_STATUS_INTERNAL_TOKEN;
// Number('') is 0, so an empty PR_NUMBER (no credit for this push) must map to NaN explicitly.
const prNumber = process.env.PR_NUMBER ? Number(process.env.PR_NUMBER) : NaN;
// The branch these assets now live on: the holding branch, then the version branch, then main.
const assetBranch = process.env.ASSET_BRANCH || undefined;
const [before, after] = process.argv.slice(2).map((s) => s.trim());

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

// A Bedrock animation file's clips live as keys of its top-level "animations" object, so a file
// with several clips (idle, walk, ...) is worth several points, not the one point a naive
// `entry.animations.length` (file count) would give it.
function countClips(ref, path) {
    try {
        const data = JSON.parse(sh(`git show ${ref}:"${path}"`));
        return Object.keys(data.animations ?? {}).length;
    } catch {
        return 0;
    }
}

// A brand-new branch's "before" is all zeros; there is nothing to diff against.
const ZERO_SHA = '0000000000000000000000000000000000000000';
const diffBase = before && before !== ZERO_SHA ? before : `${after}~1`;

const touched = sh(`git diff --name-only ${diffBase} ${after} -- ':(glob)**/credits/*/*.json'`)
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
        const newAnimations = (entry.animations ?? []).reduce(
            (sum, path) => sum + countClips(after, path),
            0,
        );
        if (!awardsByLogin.has(login)) awardsByLogin.set(login, new Map());
        const perForm = awardsByLogin.get(login);
        perForm.set(identifier, (perForm.get(identifier) ?? 0) + newAnimations);
    }
}

function sha256Hex(value) {
    return crypto.createHash('sha256').update(value, 'utf8').digest('hex');
}

const MAX_ATTEMPTS = 5;
const BASE_DELAY_MS = 2000;

const sleep = (ms) => new Promise((resolve) => setTimeout(resolve, ms));

// Only failures that say nothing about the request itself are worth retrying: a network error,
// a throttle (429) or a server-side failure (5xx, e.g. the Lambda timing out behind a 502).
// A 4xx is our mistake and would fail the same way again.
function isRetryable(status) {
    return status === undefined || status === 429 || status >= 500;
}

// Retries with exponential backoff (2s, 4s, 8s, 16s) plus jitter. Pass `retry: false` for a call
// that is not safe to repeat after an ambiguous failure.
async function post(path, body, { retry = true } = {}) {
    const jsonBody = JSON.stringify(body);
    const attempts = retry ? MAX_ATTEMPTS : 1;
    let text;
    for (let attempt = 1; ; attempt++) {
        let failure;
        let retryable = true;
        try {
            const response = await fetch(`${domain}${path}`, {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                    'X-Gravelmon-Token': `Bearer ${token}`,
                    'x-amz-content-sha256': sha256Hex(jsonBody),
                },
                body: jsonBody,
            });
            text = await response.text();
            if (response.ok) {
                console.log(`${path} -> ${response.status}: ${text}`);
                break;
            }
            failure = new Error(`${path} -> ${response.status}: ${text}`);
            retryable = isRetryable(response.status);
        } catch (err) {
            failure = err; // network error: no response at all
        }
        if (!retryable) throw failure;
        if (attempt >= attempts) throw failure;
        const delay = BASE_DELAY_MS * 2 ** (attempt - 1) + Math.random() * 1000;
        console.warn(
            `${path} attempt ${attempt}/${attempts} failed (${failure.message}); retrying in ${Math.round(delay)}ms.`,
        );
        await sleep(delay);
    }
    const parsed = JSON.parse(text);
    const failed = (parsed.updated ?? []).filter((r) => r.status === 'error');
    if (failed.length > 0) {
        throw new Error(`${path} reported per-item errors: ${JSON.stringify(failed)}`);
    }
    return parsed;
}

(async () => {
    await post('/api/internal/pokemon-status', {
        identifiers: [...touchedIdentifiers],
        ...(assetBranch ? { branch: assetBranch } : {}),
    });

    if (!Number.isFinite(prNumber)) {
        console.log('No credited PR for this push (not an initial holding-branch PR); skipping point awards.');
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
        }, { retry: false }); // a timed-out attempt may still have landed; do not risk double points
    }
})().catch((err) => {
    console.error(err);
    process.exit(1);
});
