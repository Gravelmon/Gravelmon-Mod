{
    name: "Sudowoodonite",
    spritenum: 620,
    megaStone: { "Sudowoodo": "Sudowoodo-mega"},
    itemUser: ["Sudowoodo"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10230,
    gen: 6,
    isNonstandard: "Past"
}
