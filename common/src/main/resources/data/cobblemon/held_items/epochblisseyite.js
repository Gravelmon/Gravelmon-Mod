{
    name: "Epoch blisseyite",
    spritenum: 620,
    megaStone: { "Blissey-Epoch": "Blissey-mega_epoch"},
    itemUser: ["Blissey-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10091,
    gen: 6,
    isNonstandard: "Past"
}
