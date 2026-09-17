{
    name: "Lilligantite",
    spritenum: 620,
    megaStone: { "Lilligant": "Lilligant-mega"},
    itemUser: ["Lilligant"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10245,
    gen: 6,
    isNonstandard: "Past"
}
