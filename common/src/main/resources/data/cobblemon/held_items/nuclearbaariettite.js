{
    name: "Nuclear baariettite",
    spritenum: 620,
    megaStone: { "Baariette-Nuclear": "Baariette-mega_nuclear"},
    itemUser: ["Baariette-Nuclear"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10128,
    gen: 6,
    isNonstandard: "Past"
}
