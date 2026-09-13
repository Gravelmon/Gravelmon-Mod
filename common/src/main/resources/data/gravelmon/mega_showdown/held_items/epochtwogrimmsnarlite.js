{
    name: "Epochtwo grimmsnarlite",
    spritenum: 620,
    megaStone: { "Grimmsnarl-Epochtwo": "Grimmsnarl-mega_epochtwo"},
    itemUser: ["Grimmsnarl-Epochtwo"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10013,
    gen: 6,
    isNonstandard: "Past"
}
