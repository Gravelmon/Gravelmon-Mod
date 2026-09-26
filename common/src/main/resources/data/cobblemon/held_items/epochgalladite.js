{
    name: "Epoch galladite",
    spritenum: 620,
    megaStone: { "Gallade-Epoch": "Gallade-mega_epoch"},
    itemUser: ["Gallade-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10114,
    gen: 6,
    isNonstandard: "Past"
}
