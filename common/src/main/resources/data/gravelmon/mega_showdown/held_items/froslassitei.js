{
    name: "Froslassite i",
    spritenum: 620,
    megaStone: { "Froslass": "Froslass-mega_i"},
    itemUser: ["Froslass"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10060,
    gen: 6,
    isNonstandard: "Past"
}
