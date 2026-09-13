{
    name: "Epoch banettite",
    spritenum: 620,
    megaStone: { "Banette-Epoch": "Banette-mega_epoch"},
    itemUser: ["Banette-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10004,
    gen: 6,
    isNonstandard: "Past"
}
