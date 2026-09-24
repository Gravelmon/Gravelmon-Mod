{
    name: "Epoch cofagrigusite",
    spritenum: 620,
    megaStone: { "Cofagrigus-Epoch": "Cofagrigus-mega_epoch"},
    itemUser: ["Cofagrigus-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10219,
    gen: 6,
    isNonstandard: "Past"
}
