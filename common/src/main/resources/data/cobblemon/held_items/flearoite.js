{
    name: "Flearoite",
    spritenum: 620,
    megaStone: { "Flearoe": "Flearoe-mega"},
    itemUser: ["Flearoe"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10184,
    gen: 6,
    isNonstandard: "Past"
}
