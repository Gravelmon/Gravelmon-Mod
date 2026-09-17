{
    name: "Ayreian venusaurite",
    spritenum: 620,
    megaStone: { "Venusaur-Ayreian": "Venusaur-mega_ayreian"},
    itemUser: ["Venusaur-Ayreian"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10233,
    gen: 6,
    isNonstandard: "Past"
}
