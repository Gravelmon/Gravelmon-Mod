{
    name: "Epoch beartite",
    spritenum: 620,
    megaStone: { "Beartic-Epoch": "Beartic-mega_epoch"},
    itemUser: ["Beartic-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10036,
    gen: 6,
    isNonstandard: "Past"
}
