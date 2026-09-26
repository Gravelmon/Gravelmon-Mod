{
    name: "Dinopionite",
    spritenum: 620,
    megaStone: { "Dinopion": "Dinopion-mega"},
    itemUser: ["Dinopion"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10249,
    gen: 6,
    isNonstandard: "Past"
}
