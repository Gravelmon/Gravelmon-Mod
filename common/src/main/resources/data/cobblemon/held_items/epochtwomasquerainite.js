{
    name: "Epochtwo masquerainite",
    spritenum: 620,
    megaStone: { "Masquerain-Epochtwo": "Masquerain-mega_epochtwo"},
    itemUser: ["Masquerain-Epochtwo"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10245,
    gen: 6,
    isNonstandard: "Past"
}
