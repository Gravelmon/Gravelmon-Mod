{
    name: "Epoch abomasnowite",
    spritenum: 620,
    megaStone: { "Abomasnow-Epoch": "Abomasnow-mega_epoch"},
    itemUser: ["Abomasnow-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10076,
    gen: 6,
    isNonstandard: "Past"
}
