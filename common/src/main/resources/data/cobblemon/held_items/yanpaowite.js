{
    name: "Yanpaowite",
    spritenum: 620,
    megaStone: { "Yanpaow": "Yanpaow-mega"},
    itemUser: ["Yanpaow"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10056,
    gen: 6,
    isNonstandard: "Past"
}
