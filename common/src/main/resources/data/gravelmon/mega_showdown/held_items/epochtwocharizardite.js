{
    name: "Epochtwo charizardite",
    spritenum: 620,
    megaStone: { "Charizard-Epochtwo": "Charizard-mega_epochtwo"},
    itemUser: ["Charizard-Epochtwo"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10046,
    gen: 6,
    isNonstandard: "Past"
}
