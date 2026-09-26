{
    name: "Epoch tsareenanite",
    spritenum: 620,
    megaStone: { "Tsareena-Epoch": "Tsareena-mega_epoch"},
    itemUser: ["Tsareena-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10020,
    gen: 6,
    isNonstandard: "Past"
}
