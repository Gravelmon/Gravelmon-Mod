{
    name: "Delta froslassite",
    spritenum: 620,
    megaStone: { "Froslass-Delta": "Froslass-mega_delta"},
    itemUser: ["Froslass-Delta"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10061,
    gen: 6,
    isNonstandard: "Past"
}
