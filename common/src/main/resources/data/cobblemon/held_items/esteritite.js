{
    name: "Esteritite",
    spritenum: 620,
    megaStone: { "Esterite": "Esterite-mega"},
    itemUser: ["Esterite"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10252,
    gen: 6,
    isNonstandard: "Past"
}
