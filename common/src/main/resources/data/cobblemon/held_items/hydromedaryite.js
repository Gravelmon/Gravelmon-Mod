{
    name: "Hydromedaryite",
    spritenum: 620,
    megaStone: { "Hydromedary": "Hydromedary-mega"},
    itemUser: ["Hydromedary"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10026,
    gen: 6,
    isNonstandard: "Past"
}
