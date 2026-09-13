{
    name: "Nawalite",
    spritenum: 620,
    megaStone: { "Nawale": "Nawale-mega"},
    itemUser: ["Nawale"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10099,
    gen: 6,
    isNonstandard: "Past"
}
