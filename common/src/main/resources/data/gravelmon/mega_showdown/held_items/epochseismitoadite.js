{
    name: "Epoch seismitoadite",
    spritenum: 620,
    megaStone: { "Seismitoad-Epoch": "Seismitoad-mega_epoch"},
    itemUser: ["Seismitoad-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10211,
    gen: 6,
    isNonstandard: "Past"
}
