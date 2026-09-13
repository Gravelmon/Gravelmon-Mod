{
    name: "Epoch gengarite",
    spritenum: 620,
    megaStone: { "Gengar-Epoch": "Gengar-mega_epoch"},
    itemUser: ["Gengar-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10006,
    gen: 6,
    isNonstandard: "Past"
}
