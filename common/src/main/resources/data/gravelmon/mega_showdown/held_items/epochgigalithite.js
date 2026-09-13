{
    name: "Epoch gigalithite",
    spritenum: 620,
    megaStone: { "Gigalith-Epoch": "Gigalith-mega_epoch"},
    itemUser: ["Gigalith-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10104,
    gen: 6,
    isNonstandard: "Past"
}
