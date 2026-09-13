{
    name: "Epoch sudowoodonite",
    spritenum: 620,
    megaStone: { "Sudowoodo-Epoch": "Sudowoodo-mega_epoch"},
    itemUser: ["Sudowoodo-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10231,
    gen: 6,
    isNonstandard: "Past"
}
