{
    name: "Epoch minunite",
    spritenum: 620,
    megaStone: { "Minun-Epoch": "Minun-mega_epoch"},
    itemUser: ["Minun-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10042,
    gen: 6,
    isNonstandard: "Past"
}
