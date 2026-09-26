{
    name: "Baariettite",
    spritenum: 620,
    megaStone: { "Baariette": "Baariette-mega"},
    itemUser: ["Baariette"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10127,
    gen: 6,
    isNonstandard: "Past"
}
