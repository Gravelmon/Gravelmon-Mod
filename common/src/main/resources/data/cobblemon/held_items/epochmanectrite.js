{
    name: "Epoch manectrite",
    spritenum: 620,
    megaStone: { "Manectric-Epoch": "Manectric-mega_epoch"},
    itemUser: ["Manectric-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10248,
    gen: 6,
    isNonstandard: "Past"
}
