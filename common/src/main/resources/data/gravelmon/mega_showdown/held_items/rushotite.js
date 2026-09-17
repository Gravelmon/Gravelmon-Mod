{
    name: "Rushotite",
    spritenum: 620,
    megaStone: { "Rushot": "Rushot-mega"},
    itemUser: ["Rushot"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10083,
    gen: 6,
    isNonstandard: "Past"
}
