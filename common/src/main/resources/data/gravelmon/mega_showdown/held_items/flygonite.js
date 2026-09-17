{
    name: "Flygonite",
    spritenum: 620,
    megaStone: { "Flygon": "Flygon-mega"},
    itemUser: ["Flygon"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10147,
    gen: 6,
    isNonstandard: "Past"
}
