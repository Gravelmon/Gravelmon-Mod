{
    name: "Bisharpite",
    spritenum: 620,
    megaStone: { "Bisharp": "Bisharp-mega"},
    itemUser: ["Bisharp"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10232,
    gen: 6,
    isNonstandard: "Past"
}
