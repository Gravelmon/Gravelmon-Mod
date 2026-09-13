{
    name: "Caramelixite",
    spritenum: 620,
    megaStone: { "Caramelix": "Caramelix-mega"},
    itemUser: ["Caramelix"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10012,
    gen: 6,
    isNonstandard: "Past"
}
