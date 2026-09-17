{
    name: "Archillesite",
    spritenum: 620,
    megaStone: { "Archilles": "Archilles-mega"},
    itemUser: ["Archilles"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10164,
    gen: 6,
    isNonstandard: "Past"
}
