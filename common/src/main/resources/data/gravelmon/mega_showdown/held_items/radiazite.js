{
    name: "Radiazite",
    spritenum: 620,
    megaStone: { "Radiaze": "Radiaze-mega"},
    itemUser: ["Radiaze"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10057,
    gen: 6,
    isNonstandard: "Past"
}
