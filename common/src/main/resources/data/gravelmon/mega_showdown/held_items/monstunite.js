{
    name: "Monstunite",
    spritenum: 620,
    megaStone: { "Monstune": "Monstune-mega"},
    itemUser: ["Monstune"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10210,
    gen: 6,
    isNonstandard: "Past"
}
