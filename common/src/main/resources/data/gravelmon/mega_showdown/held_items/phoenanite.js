{
    name: "Phoenanite",
    spritenum: 620,
    megaStone: { "Phoenan": "Phoenan-mega"},
    itemUser: ["Phoenan"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10141,
    gen: 6,
    isNonstandard: "Past"
}
