{
    name: "Zoroarkite",
    spritenum: 620,
    megaStone: { "Zoroark": "Zoroark-mega"},
    itemUser: ["Zoroark"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10194,
    gen: 6,
    isNonstandard: "Past"
}
