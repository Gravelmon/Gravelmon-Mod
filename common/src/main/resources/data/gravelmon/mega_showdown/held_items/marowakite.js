{
    name: "Marowakite",
    spritenum: 620,
    megaStone: { "Marowak": "Marowak-mega"},
    itemUser: ["Marowak"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10068,
    gen: 6,
    isNonstandard: "Past"
}
