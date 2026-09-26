{
    name: "Raizodonite",
    spritenum: 620,
    megaStone: { "Raizodon": "Raizodon-mega"},
    itemUser: ["Raizodon"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10202,
    gen: 6,
    isNonstandard: "Past"
}
