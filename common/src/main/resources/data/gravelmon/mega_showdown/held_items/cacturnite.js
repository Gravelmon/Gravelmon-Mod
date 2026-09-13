{
    name: "Cacturnite",
    spritenum: 620,
    megaStone: { "Cacturne": "Cacturne-mega"},
    itemUser: ["Cacturne"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10022,
    gen: 6,
    isNonstandard: "Past"
}
