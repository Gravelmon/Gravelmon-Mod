{
    name: "Delta venusaurite",
    spritenum: 620,
    megaStone: { "Venusaur-Delta": "Venusaur-mega_delta"},
    itemUser: ["Venusaur-Delta"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10232,
    gen: 6,
    isNonstandard: "Past"
}
