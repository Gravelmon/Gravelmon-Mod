{
    name: "Politoedite",
    spritenum: 620,
    megaStone: { "Politoed": "Politoed-mega"},
    itemUser: ["Politoed"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10099,
    gen: 6,
    isNonstandard: "Past"
}
