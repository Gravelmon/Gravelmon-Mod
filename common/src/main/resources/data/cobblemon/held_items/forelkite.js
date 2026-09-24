{
    name: "Forelkite",
    spritenum: 620,
    megaStone: { "Forelk": "Forelk-mega"},
    itemUser: ["Forelk"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10185,
    gen: 6,
    isNonstandard: "Past"
}
