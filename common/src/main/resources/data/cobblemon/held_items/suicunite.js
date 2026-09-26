{
    name: "Suicunite",
    spritenum: 620,
    megaStone: { "Suicune": "Suicune-mega"},
    itemUser: ["Suicune"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10196,
    gen: 6,
    isNonstandard: "Past"
}
