{
    name: "Epoch ampharosite",
    spritenum: 620,
    megaStone: { "Ampharos-Epoch": "Ampharos-mega_epoch"},
    itemUser: ["Ampharos-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10207,
    gen: 6,
    isNonstandard: "Past"
}
