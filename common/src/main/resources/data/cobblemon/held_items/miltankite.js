{
    name: "Miltankite",
    spritenum: 620,
    megaStone: { "Miltank": "Miltank-mega"},
    itemUser: ["Miltank"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10057,
    gen: 6,
    isNonstandard: "Past"
}
