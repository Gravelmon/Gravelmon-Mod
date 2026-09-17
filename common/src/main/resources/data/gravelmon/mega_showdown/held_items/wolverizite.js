{
    name: "Wolverizite",
    spritenum: 620,
    megaStone: { "Wolverize": "Wolverize-mega"},
    itemUser: ["Wolverize"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10123,
    gen: 6,
    isNonstandard: "Past"
}
