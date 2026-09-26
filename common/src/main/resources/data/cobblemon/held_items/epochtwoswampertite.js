{
    name: "Epochtwo swampertite",
    spritenum: 620,
    megaStone: { "Swampert-Epochtwo": "Swampert-mega_epochtwo"},
    itemUser: ["Swampert-Epochtwo"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10050,
    gen: 6,
    isNonstandard: "Past"
}
