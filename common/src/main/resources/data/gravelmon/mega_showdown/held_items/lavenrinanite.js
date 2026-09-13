{
    name: "Lavenrinanite",
    spritenum: 620,
    megaStone: { "Lavenrina": "Lavenrina-mega"},
    itemUser: ["Lavenrina"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10130,
    gen: 6,
    isNonstandard: "Past"
}
