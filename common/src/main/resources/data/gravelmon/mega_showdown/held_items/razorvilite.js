{
    name: "Razorvilite",
    spritenum: 620,
    megaStone: { "Razorvile": "Razorvile-mega"},
    itemUser: ["Razorvile"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10226,
    gen: 6,
    isNonstandard: "Past"
}
