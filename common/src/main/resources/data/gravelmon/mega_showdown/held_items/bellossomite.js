{
    name: "Bellossomite",
    spritenum: 620,
    megaStone: { "Bellossom": "Bellossom-mega"},
    itemUser: ["Bellossom"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10221,
    gen: 6,
    isNonstandard: "Past"
}
