{
    name: "Epoch barbaraclite",
    spritenum: 620,
    megaStone: { "Barbaracle-Epoch": "Barbaracle-mega_epoch"},
    itemUser: ["Barbaracle-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10039,
    gen: 6,
    isNonstandard: "Past"
}
