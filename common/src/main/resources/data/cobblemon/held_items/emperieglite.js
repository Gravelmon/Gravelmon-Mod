{
    name: "Emperieglite",
    spritenum: 620,
    megaStone: { "Emperiegle": "Emperiegle-mega"},
    itemUser: ["Emperiegle"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10132,
    gen: 6,
    isNonstandard: "Past"
}
