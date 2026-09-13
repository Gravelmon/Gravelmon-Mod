{
    name: "Jayzurite",
    spritenum: 620,
    megaStone: { "Jayzure": "Jayzure-mega"},
    itemUser: ["Jayzure"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10063,
    gen: 6,
    isNonstandard: "Past"
}
