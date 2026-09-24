{
    name: "Kiricornite",
    spritenum: 620,
    megaStone: { "Kiricorn": "Kiricorn-mega"},
    itemUser: ["Kiricorn"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10166,
    gen: 6,
    isNonstandard: "Past"
}
