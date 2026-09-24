{
    name: "Epochtwo altarianite",
    spritenum: 620,
    megaStone: { "Altaria-Epochtwo": "Altaria-mega_epochtwo"},
    itemUser: ["Altaria-Epochtwo"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10018,
    gen: 6,
    isNonstandard: "Past"
}
