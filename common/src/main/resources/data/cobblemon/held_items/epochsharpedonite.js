{
    name: "Epoch sharpedonite",
    spritenum: 620,
    megaStone: { "Sharpedo-Epoch": "Sharpedo-mega_epoch"},
    itemUser: ["Sharpedo-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10021,
    gen: 6,
    isNonstandard: "Past"
}
