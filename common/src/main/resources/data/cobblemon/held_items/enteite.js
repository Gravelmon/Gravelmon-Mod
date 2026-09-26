{
    name: "Enteite",
    spritenum: 620,
    megaStone: { "Entei": "Entei-mega"},
    itemUser: ["Entei"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10151,
    gen: 6,
    isNonstandard: "Past"
}
