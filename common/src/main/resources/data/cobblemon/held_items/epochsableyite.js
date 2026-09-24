{
    name: "Epoch sableyite",
    spritenum: 620,
    megaStone: { "Sableye-Epoch": "Sableye-mega_epoch"},
    itemUser: ["Sableye-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10086,
    gen: 6,
    isNonstandard: "Past"
}
