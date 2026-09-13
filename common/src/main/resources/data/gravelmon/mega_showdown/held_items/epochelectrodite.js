{
    name: "Epoch electrodite",
    spritenum: 620,
    megaStone: { "Electrode-Epoch": "Electrode-mega_epoch"},
    itemUser: ["Electrode-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10227,
    gen: 6,
    isNonstandard: "Past"
}
