{
    name: "Epochtwo gigalithite",
    spritenum: 620,
    megaStone: { "Gigalith-Epochtwo": "Gigalith-mega_epochtwo"},
    itemUser: ["Gigalith-Epochtwo"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10104,
    gen: 6,
    isNonstandard: "Past"
}
