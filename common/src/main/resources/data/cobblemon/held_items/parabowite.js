{
    name: "Parabowite",
    spritenum: 620,
    megaStone: { "Parabow": "Parabow-mega"},
    itemUser: ["Parabow"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10181,
    gen: 6,
    isNonstandard: "Past"
}
