{
    name: "Cofagrigusite",
    spritenum: 620,
    megaStone: { "Cofagrigus": "Cofagrigus-mega"},
    itemUser: ["Cofagrigus"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10220,
    gen: 6,
    isNonstandard: "Past"
}
