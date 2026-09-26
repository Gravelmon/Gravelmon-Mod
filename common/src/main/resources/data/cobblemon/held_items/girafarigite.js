{
    name: "Girafarigite",
    spritenum: 620,
    megaStone: { "Girafarig": "Girafarig-mega"},
    itemUser: ["Girafarig"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10027,
    gen: 6,
    isNonstandard: "Past"
}
