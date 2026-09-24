{
    name: "Lilligantite",
    spritenum: 620,
    megaStone: { "Lilligant": "Lilligant-mega"},
    itemUser: ["Lilligant"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10246,
    gen: 6,
    isNonstandard: "Past"
}
