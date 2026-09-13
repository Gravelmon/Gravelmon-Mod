{
    name: "Crawdauntite",
    spritenum: 620,
    megaStone: { "Crawdaunt": "Crawdaunt-mega"},
    itemUser: ["Crawdaunt"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10163,
    gen: 6,
    isNonstandard: "Past"
}
