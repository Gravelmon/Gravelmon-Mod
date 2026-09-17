{
    name: "Epoch beheeyemite",
    spritenum: 620,
    megaStone: { "Beheeyem-Epoch": "Beheeyem-mega_epoch"},
    itemUser: ["Beheeyem-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10132,
    gen: 6,
    isNonstandard: "Past"
}
