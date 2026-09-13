{
    name: "Epoch starmite",
    spritenum: 620,
    megaStone: { "Starmie-Epoch": "Starmie-mega_epoch"},
    itemUser: ["Starmie-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10048,
    gen: 6,
    isNonstandard: "Past"
}
