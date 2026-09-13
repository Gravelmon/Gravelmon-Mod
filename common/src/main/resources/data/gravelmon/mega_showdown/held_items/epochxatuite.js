{
    name: "Epoch xatuite",
    spritenum: 620,
    megaStone: { "Xatu-Epoch": "Xatu-mega_epoch"},
    itemUser: ["Xatu-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10159,
    gen: 6,
    isNonstandard: "Past"
}
