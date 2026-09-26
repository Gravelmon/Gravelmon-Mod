{
    name: "Epoch altarianite",
    spritenum: 620,
    megaStone: { "Altaria-Epoch": "Altaria-mega_epoch"},
    itemUser: ["Altaria-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10017,
    gen: 6,
    isNonstandard: "Past"
}
