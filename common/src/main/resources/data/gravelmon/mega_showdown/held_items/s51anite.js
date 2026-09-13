{
    name: "S51anite",
    spritenum: 620,
    megaStone: { "S51a": "S51a-mega"},
    itemUser: ["S51a"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10219,
    gen: 6,
    isNonstandard: "Past"
}
