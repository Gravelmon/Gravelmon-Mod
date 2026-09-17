{
    name: "Maidnitite",
    spritenum: 620,
    megaStone: { "Maidnite": "Maidnite-mega"},
    itemUser: ["Maidnite"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10185,
    gen: 6,
    isNonstandard: "Past"
}
