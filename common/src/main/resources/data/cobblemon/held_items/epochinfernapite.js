{
    name: "Epoch infernapite",
    spritenum: 620,
    megaStone: { "Infernape-Epoch": "Infernape-mega_epoch"},
    itemUser: ["Infernape-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10179,
    gen: 6,
    isNonstandard: "Past"
}
