{
    name: "Epoch medichamite",
    spritenum: 620,
    megaStone: { "Medicham-Epoch": "Medicham-mega_epoch"},
    itemUser: ["Medicham-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10110,
    gen: 6,
    isNonstandard: "Past"
}
