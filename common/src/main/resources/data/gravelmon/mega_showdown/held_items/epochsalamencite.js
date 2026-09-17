{
    name: "Epoch salamencite",
    spritenum: 620,
    megaStone: { "Salamence-Epoch": "Salamence-mega_epoch"},
    itemUser: ["Salamence-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10210,
    gen: 6,
    isNonstandard: "Past"
}
