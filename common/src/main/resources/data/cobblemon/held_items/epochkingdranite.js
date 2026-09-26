{
    name: "Epoch kingdranite",
    spritenum: 620,
    megaStone: { "Kingdra-Epoch": "Kingdra-mega_epoch"},
    itemUser: ["Kingdra-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10167,
    gen: 6,
    isNonstandard: "Past"
}
