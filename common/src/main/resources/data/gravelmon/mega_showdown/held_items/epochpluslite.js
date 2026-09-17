{
    name: "Epoch pluslite",
    spritenum: 620,
    megaStone: { "Plusle-Epoch": "Plusle-mega_epoch"},
    itemUser: ["Plusle-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10226,
    gen: 6,
    isNonstandard: "Past"
}
