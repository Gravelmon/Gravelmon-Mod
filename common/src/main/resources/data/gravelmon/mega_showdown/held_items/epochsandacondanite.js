{
    name: "Epoch sandacondanite",
    spritenum: 620,
    megaStone: { "Sandaconda-Epoch": "Sandaconda-mega_epoch"},
    itemUser: ["Sandaconda-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10201,
    gen: 6,
    isNonstandard: "Past"
}
