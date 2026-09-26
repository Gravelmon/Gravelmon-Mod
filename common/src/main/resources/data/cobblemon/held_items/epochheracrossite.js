{
    name: "Epoch heracrossite",
    spritenum: 620,
    megaStone: { "Heracross-Epoch": "Heracross-mega_epoch"},
    itemUser: ["Heracross-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10082,
    gen: 6,
    isNonstandard: "Past"
}
