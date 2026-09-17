{
    name: "Epoch golurkite",
    spritenum: 620,
    megaStone: { "Golurk-Epoch": "Golurk-mega_epoch"},
    itemUser: ["Golurk-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10066,
    gen: 6,
    isNonstandard: "Past"
}
