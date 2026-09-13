{
    name: "Fevestanite",
    spritenum: 620,
    megaStone: { "Fevesta": "Fevesta-mega"},
    itemUser: ["Fevesta"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10195,
    gen: 6,
    isNonstandard: "Past"
}
