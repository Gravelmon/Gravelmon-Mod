{
    name: "Smaquanite",
    spritenum: 620,
    megaStone: { "Smaqua": "Smaqua-mega"},
    itemUser: ["Smaqua"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10071,
    gen: 6,
    isNonstandard: "Past"
}
