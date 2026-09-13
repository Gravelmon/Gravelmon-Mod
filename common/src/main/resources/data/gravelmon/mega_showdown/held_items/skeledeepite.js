{
    name: "Skeledeepite",
    spritenum: 620,
    megaStone: { "Skeledeep": "Skeledeep-mega"},
    itemUser: ["Skeledeep"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10203,
    gen: 6,
    isNonstandard: "Past"
}
