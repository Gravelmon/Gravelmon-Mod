{
    name: "Epoch avaluggite",
    spritenum: 620,
    megaStone: { "Avalugg-Epoch": "Avalugg-mega_epoch"},
    itemUser: ["Avalugg-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10127,
    gen: 6,
    isNonstandard: "Past"
}
