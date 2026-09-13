{
    name: "Delta galladite",
    spritenum: 620,
    megaStone: { "Gallade-Delta": "Gallade-mega_delta"},
    itemUser: ["Gallade-Delta"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10113,
    gen: 6,
    isNonstandard: "Past"
}
