{
    name: "Epochtwo sableyite",
    spritenum: 620,
    megaStone: { "Sableye-Epochtwo": "Sableye-mega_epochtwo"},
    itemUser: ["Sableye-Epochtwo"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10088,
    gen: 6,
    isNonstandard: "Past"
}
