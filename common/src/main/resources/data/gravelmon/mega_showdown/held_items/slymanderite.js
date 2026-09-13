{
    name: "Slymanderite",
    spritenum: 620,
    megaStone: { "Slymander": "Slymander-mega"},
    itemUser: ["Slymander"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10211,
    gen: 6,
    isNonstandard: "Past"
}
