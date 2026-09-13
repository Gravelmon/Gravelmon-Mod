{
    name: "Delta medichamite",
    spritenum: 620,
    megaStone: { "Medicham-Delta": "Medicham-mega_delta"},
    itemUser: ["Medicham-Delta"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10110,
    gen: 6,
    isNonstandard: "Past"
}
