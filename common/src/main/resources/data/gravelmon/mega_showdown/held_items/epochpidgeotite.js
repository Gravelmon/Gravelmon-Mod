{
    name: "Epoch pidgeotite",
    spritenum: 620,
    megaStone: { "Pidgeot-Epoch": "Pidgeot-mega_epoch"},
    itemUser: ["Pidgeot-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10126,
    gen: 6,
    isNonstandard: "Past"
}
