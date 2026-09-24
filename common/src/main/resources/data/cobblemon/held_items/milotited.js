{
    name: "Milotite d",
    spritenum: 620,
    megaStone: { "Milotic": "Milotic-mega_d"},
    itemUser: ["Milotic"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10178,
    gen: 6,
    isNonstandard: "Past"
}
