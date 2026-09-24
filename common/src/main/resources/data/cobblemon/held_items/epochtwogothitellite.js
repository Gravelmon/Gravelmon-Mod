{
    name: "Epochtwo gothitellite",
    spritenum: 620,
    megaStone: { "Gothitelle-Epochtwo": "Gothitelle-mega_epochtwo"},
    itemUser: ["Gothitelle-Epochtwo"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10139,
    gen: 6,
    isNonstandard: "Past"
}
