{
    name: "Stunfiskite",
    spritenum: 620,
    megaStone: { "Stunfisk": "Stunfisk-mega"},
    itemUser: ["Stunfisk"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10034,
    gen: 6,
    isNonstandard: "Past"
}
