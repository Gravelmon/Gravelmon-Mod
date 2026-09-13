{
    name: "Epoch dugtrionite",
    spritenum: 620,
    megaStone: { "Dugtrio-Epoch": "Dugtrio-mega_epoch"},
    itemUser: ["Dugtrio-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10055,
    gen: 6,
    isNonstandard: "Past"
}
