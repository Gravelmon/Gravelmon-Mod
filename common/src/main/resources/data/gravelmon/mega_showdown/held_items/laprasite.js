{
    name: "Laprasite",
    spritenum: 620,
    megaStone: { "Lapras": "Lapras-mega"},
    itemUser: ["Lapras"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10200,
    gen: 6,
    isNonstandard: "Past"
}
