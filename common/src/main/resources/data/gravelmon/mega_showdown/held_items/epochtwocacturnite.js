{
    name: "Epochtwo cacturnite",
    spritenum: 620,
    megaStone: { "Cacturne-Epochtwo": "Cacturne-mega_epochtwo"},
    itemUser: ["Cacturne-Epochtwo"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10023,
    gen: 6,
    isNonstandard: "Past"
}
