{
    name: "Strikezallite",
    spritenum: 620,
    megaStone: { "Strikezall": "Strikezall-mega"},
    itemUser: ["Strikezall"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10077,
    gen: 6,
    isNonstandard: "Past"
}
