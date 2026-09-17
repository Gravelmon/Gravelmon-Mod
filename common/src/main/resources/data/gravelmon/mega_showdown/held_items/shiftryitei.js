{
    name: "Shiftryite i",
    spritenum: 620,
    megaStone: { "Shiftry": "Shiftry-mega_i"},
    itemUser: ["Shiftry"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10089,
    gen: 6,
    isNonstandard: "Past"
}
