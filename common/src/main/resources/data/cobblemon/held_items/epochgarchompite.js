{
    name: "Epoch garchompite",
    spritenum: 620,
    megaStone: { "Garchomp-Epoch": "Garchomp-mega_epoch"},
    itemUser: ["Garchomp-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10146,
    gen: 6,
    isNonstandard: "Past"
}
