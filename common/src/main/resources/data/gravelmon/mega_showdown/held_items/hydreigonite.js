{
    name: "Hydreigonite",
    spritenum: 620,
    megaStone: { "Hydreigon": "Hydreigon-mega"},
    itemUser: ["Hydreigon"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10010,
    gen: 6,
    isNonstandard: "Past"
}
