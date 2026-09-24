{
    name: "Epoch arbokite",
    spritenum: 620,
    megaStone: { "Arbok-Epoch": "Arbok-mega_epoch"},
    itemUser: ["Arbok-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10052,
    gen: 6,
    isNonstandard: "Past"
}
