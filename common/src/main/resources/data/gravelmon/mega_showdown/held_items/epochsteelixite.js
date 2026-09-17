{
    name: "Epoch steelixite",
    spritenum: 620,
    megaStone: { "Steelix-Epoch": "Steelix-mega_epoch"},
    itemUser: ["Steelix-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10163,
    gen: 6,
    isNonstandard: "Past"
}
