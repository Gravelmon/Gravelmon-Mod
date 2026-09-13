{
    name: "Rupsenite",
    spritenum: 620,
    megaStone: { "Rupsen": "Rupsen-mega"},
    itemUser: ["Rupsen"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10202,
    gen: 6,
    isNonstandard: "Past"
}
