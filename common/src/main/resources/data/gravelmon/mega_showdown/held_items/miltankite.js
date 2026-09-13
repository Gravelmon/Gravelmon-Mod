{
    name: "Miltankite",
    spritenum: 620,
    megaStone: { "Miltank": "Miltank-mega"},
    itemUser: ["Miltank"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10058,
    gen: 6,
    isNonstandard: "Past"
}
