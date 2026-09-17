{
    name: "Epoch tentacruelite",
    spritenum: 620,
    megaStone: { "Tentacruel-Epoch": "Tentacruel-mega_epoch"},
    itemUser: ["Tentacruel-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10079,
    gen: 6,
    isNonstandard: "Past"
}
