{
    name: "Mienshaonite",
    spritenum: 620,
    megaStone: { "Mienshao": "Mienshao-mega"},
    itemUser: ["Mienshao"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10238,
    gen: 6,
    isNonstandard: "Past"
}
