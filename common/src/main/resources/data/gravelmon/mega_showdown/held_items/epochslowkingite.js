{
    name: "Epoch slowkingite",
    spritenum: 620,
    megaStone: { "Slowking-Epoch": "Slowking-mega_epoch"},
    itemUser: ["Slowking-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10058,
    gen: 6,
    isNonstandard: "Past"
}
