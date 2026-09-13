{
    name: "Emporeelite",
    spritenum: 620,
    megaStone: { "Emporeel": "Emporeel-mega"},
    itemUser: ["Emporeel"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10007,
    gen: 6,
    isNonstandard: "Past"
}
