{
    name: "Leonitite",
    spritenum: 620,
    megaStone: { "Leonite": "Leonite-mega"},
    itemUser: ["Leonite"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10172,
    gen: 6,
    isNonstandard: "Past"
}
