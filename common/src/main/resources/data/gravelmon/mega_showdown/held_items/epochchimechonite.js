{
    name: "Epoch chimechonite",
    spritenum: 620,
    megaStone: { "Chimecho-Epoch": "Chimecho-mega_epoch"},
    itemUser: ["Chimecho-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10157,
    gen: 6,
    isNonstandard: "Past"
}
