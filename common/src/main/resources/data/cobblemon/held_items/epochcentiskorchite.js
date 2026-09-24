{
    name: "Epoch centiskorchite",
    spritenum: 620,
    megaStone: { "Centiskorch-Epoch": "Centiskorch-mega_epoch"},
    itemUser: ["Centiskorch-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10197,
    gen: 6,
    isNonstandard: "Past"
}
