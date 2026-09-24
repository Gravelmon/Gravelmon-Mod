{
    name: "Venusaurite d",
    spritenum: 620,
    megaStone: { "Venusaur": "Venusaur-mega_d"},
    itemUser: ["Venusaur"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10233,
    gen: 6,
    isNonstandard: "Past"
}
