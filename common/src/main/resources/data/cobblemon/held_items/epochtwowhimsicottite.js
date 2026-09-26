{
    name: "Epochtwo whimsicottite",
    spritenum: 620,
    megaStone: { "Whimsicott-Epochtwo": "Whimsicott-mega_epochtwo"},
    itemUser: ["Whimsicott-Epochtwo"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10096,
    gen: 6,
    isNonstandard: "Past"
}
