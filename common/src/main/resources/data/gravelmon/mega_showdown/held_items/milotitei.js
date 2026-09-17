{
    name: "Milotite i",
    spritenum: 620,
    megaStone: { "Milotic": "Milotic-mega_i"},
    itemUser: ["Milotic"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10175,
    gen: 6,
    isNonstandard: "Past"
}
