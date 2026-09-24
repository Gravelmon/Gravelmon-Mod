{
    name: "Whimsicottite",
    spritenum: 620,
    megaStone: { "Whimsicott": "Whimsicott-mega"},
    itemUser: ["Whimsicott"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10097,
    gen: 6,
    isNonstandard: "Past"
}
