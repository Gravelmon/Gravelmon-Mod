{
    name: "Steelixite fire",
    spritenum: 620,
    megaStone: { "Steelix": "Steelix-mega_fire"},
    itemUser: ["Steelix"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10165,
    gen: 6,
    isNonstandard: "Past"
}
