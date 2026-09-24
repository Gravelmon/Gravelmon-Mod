{
    name: "Morphiasite",
    spritenum: 620,
    megaStone: { "Morphias": "Morphias-mega"},
    itemUser: ["Morphias"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10215,
    gen: 6,
    isNonstandard: "Past"
}
