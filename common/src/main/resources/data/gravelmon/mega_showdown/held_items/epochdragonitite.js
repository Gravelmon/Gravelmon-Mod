{
    name: "Epoch dragonitite",
    spritenum: 620,
    megaStone: { "Dragonite-Epoch": "Dragonite-mega_epoch"},
    itemUser: ["Dragonite-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10252,
    gen: 6,
    isNonstandard: "Past"
}
