{
    name: "Epochtwo wyrdeerite",
    spritenum: 620,
    megaStone: { "Wyrdeer-Epochtwo": "Wyrdeer-mega_epochtwo"},
    itemUser: ["Wyrdeer-Epochtwo"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10174,
    gen: 6,
    isNonstandard: "Past"
}
