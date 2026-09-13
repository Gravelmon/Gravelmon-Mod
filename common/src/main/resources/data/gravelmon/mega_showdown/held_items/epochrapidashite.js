{
    name: "Epoch rapidashite",
    spritenum: 620,
    megaStone: { "Rapidash-Epoch": "Rapidash-mega_epoch"},
    itemUser: ["Rapidash-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10193,
    gen: 6,
    isNonstandard: "Past"
}
