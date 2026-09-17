{
    name: "Gandolphite",
    spritenum: 620,
    megaStone: { "Gandolph": "Gandolph-mega"},
    itemUser: ["Gandolph"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10092,
    gen: 6,
    isNonstandard: "Past"
}
