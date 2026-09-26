{
    name: "Lophugite",
    spritenum: 620,
    megaStone: { "Lophug": "Lophug-mega"},
    itemUser: ["Lophug"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10011,
    gen: 6,
    isNonstandard: "Past"
}
