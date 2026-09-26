{
    name: "Chatotite",
    spritenum: 620,
    megaStone: { "Chatot": "Chatot-mega"},
    itemUser: ["Chatot"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10239,
    gen: 6,
    isNonstandard: "Past"
}
