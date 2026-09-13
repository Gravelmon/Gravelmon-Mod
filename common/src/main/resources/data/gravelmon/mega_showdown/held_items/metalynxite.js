{
    name: "Metalynxite",
    spritenum: 620,
    megaStone: { "Metalynx": "Metalynx-mega"},
    itemUser: ["Metalynx"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10095,
    gen: 6,
    isNonstandard: "Past"
}
