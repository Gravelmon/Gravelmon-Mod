{
    name: "Phantomailite",
    spritenum: 620,
    megaStone: { "Phantomail": "Phantomail-mega"},
    itemUser: ["Phantomail"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10065,
    gen: 6,
    isNonstandard: "Past"
}
