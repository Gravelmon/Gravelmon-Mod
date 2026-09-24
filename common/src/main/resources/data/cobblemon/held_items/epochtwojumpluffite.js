{
    name: "Epochtwo jumpluffite",
    spritenum: 620,
    megaStone: { "Jumpluff-Epochtwo": "Jumpluff-mega_epochtwo"},
    itemUser: ["Jumpluff-Epochtwo"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10237,
    gen: 6,
    isNonstandard: "Past"
}
