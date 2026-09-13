{
    name: "Epoch houndoomite",
    spritenum: 620,
    megaStone: { "Houndoom-Epoch": "Houndoom-mega_epoch"},
    itemUser: ["Houndoom-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10108,
    gen: 6,
    isNonstandard: "Past"
}
