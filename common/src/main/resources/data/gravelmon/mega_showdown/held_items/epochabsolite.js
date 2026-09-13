{
    name: "Epoch absolite",
    spritenum: 620,
    megaStone: { "Absol-Epoch": "Absol-mega_epoch"},
    itemUser: ["Absol-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10032,
    gen: 6,
    isNonstandard: "Past"
}
