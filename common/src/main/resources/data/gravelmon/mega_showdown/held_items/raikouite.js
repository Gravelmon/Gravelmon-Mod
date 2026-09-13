{
    name: "Raikouite",
    spritenum: 620,
    megaStone: { "Raikou": "Raikou-mega"},
    itemUser: ["Raikou"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10164,
    gen: 6,
    isNonstandard: "Past"
}
