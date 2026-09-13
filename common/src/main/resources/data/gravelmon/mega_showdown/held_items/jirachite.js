{
    name: "Jirachite",
    spritenum: 620,
    megaStone: { "Jirachi": "Jirachi-mega"},
    itemUser: ["Jirachi"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10112,
    gen: 6,
    isNonstandard: "Past"
}
