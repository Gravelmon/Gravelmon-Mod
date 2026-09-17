{
    name: "Mountrite",
    spritenum: 620,
    megaStone: { "Mountree": "Mountree-mega"},
    itemUser: ["Mountree"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10170,
    gen: 6,
    isNonstandard: "Past"
}
