{
    name: "Magcargonite",
    spritenum: 620,
    megaStone: { "Magcargo": "Magcargo-mega"},
    itemUser: ["Magcargo"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10217,
    gen: 6,
    isNonstandard: "Past"
}
