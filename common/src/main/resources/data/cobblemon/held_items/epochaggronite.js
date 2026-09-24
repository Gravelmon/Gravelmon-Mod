{
    name: "Epoch aggronite",
    spritenum: 620,
    megaStone: { "Aggron-Epoch": "Aggron-mega_epoch"},
    itemUser: ["Aggron-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10037,
    gen: 6,
    isNonstandard: "Past"
}
