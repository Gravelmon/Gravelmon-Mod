{
    name: "Zebstrikanite",
    spritenum: 620,
    megaStone: { "Zebstrika": "Zebstrika-mega"},
    itemUser: ["Zebstrika"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10063,
    gen: 6,
    isNonstandard: "Past"
}
