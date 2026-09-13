{
    name: "Gothitellite",
    spritenum: 620,
    megaStone: { "Gothitelle": "Gothitelle-mega"},
    itemUser: ["Gothitelle"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10138,
    gen: 6,
    isNonstandard: "Past"
}
