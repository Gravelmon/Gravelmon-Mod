{
    name: "Luxrayite",
    spritenum: 620,
    megaStone: { "Luxray": "Luxray-mega"},
    itemUser: ["Luxray"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10177,
    gen: 6,
    isNonstandard: "Past"
}
