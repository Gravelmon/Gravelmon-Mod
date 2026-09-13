{
    name: "Akrovernite",
    spritenum: 620,
    megaStone: { "Akrovern": "Akrovern-mega"},
    itemUser: ["Akrovern"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10148,
    gen: 6,
    isNonstandard: "Past"
}
