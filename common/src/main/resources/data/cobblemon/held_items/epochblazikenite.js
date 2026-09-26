{
    name: "Epoch blazikenite",
    spritenum: 620,
    megaStone: { "Blaziken-Epoch": "Blaziken-mega_epoch"},
    itemUser: ["Blaziken-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10005,
    gen: 6,
    isNonstandard: "Past"
}
