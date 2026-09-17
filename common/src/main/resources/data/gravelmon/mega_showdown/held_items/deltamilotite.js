{
    name: "Delta milotite",
    spritenum: 620,
    megaStone: { "Milotic-Delta": "Milotic-mega_delta"},
    itemUser: ["Milotic-Delta"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10176,
    gen: 6,
    isNonstandard: "Past"
}
