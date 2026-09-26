{
    name: "Epochtwo absolite",
    spritenum: 620,
    megaStone: { "Absol-Epochtwo": "Absol-mega_epochtwo"},
    itemUser: ["Absol-Epochtwo"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10033,
    gen: 6,
    isNonstandard: "Past"
}
