{
    name: "Delta bisharpite",
    spritenum: 620,
    megaStone: { "Bisharp-Delta": "Bisharp-mega_delta"},
    itemUser: ["Bisharp-Delta"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10233,
    gen: 6,
    isNonstandard: "Past"
}
