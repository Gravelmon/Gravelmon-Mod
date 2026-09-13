{
    name: "Meganiumite i",
    spritenum: 620,
    megaStone: { "Meganium": "Meganium-mega_i"},
    itemUser: ["Meganium"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10003,
    gen: 6,
    isNonstandard: "Past"
}
