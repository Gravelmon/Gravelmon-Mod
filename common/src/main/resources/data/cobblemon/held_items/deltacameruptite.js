{
    name: "Delta cameruptite",
    spritenum: 620,
    megaStone: { "Camerupt-Delta": "Camerupt-mega_delta"},
    itemUser: ["Camerupt-Delta"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10238,
    gen: 6,
    isNonstandard: "Past"
}
