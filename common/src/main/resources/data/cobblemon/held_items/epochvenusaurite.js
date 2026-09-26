{
    name: "Epoch venusaurite",
    spritenum: 620,
    megaStone: { "Venusaur-Epoch": "Venusaur-mega_epoch"},
    itemUser: ["Venusaur-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10235,
    gen: 6,
    isNonstandard: "Past"
}
