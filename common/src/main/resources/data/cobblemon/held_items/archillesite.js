{
    name: "Archillesite",
    spritenum: 620,
    megaStone: { "Archilles": "Archilles-mega"},
    itemUser: ["Archilles"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10165,
    gen: 6,
    isNonstandard: "Past"
}
