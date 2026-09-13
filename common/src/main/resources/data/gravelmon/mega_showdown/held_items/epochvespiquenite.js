{
    name: "Epoch vespiquenite",
    spritenum: 620,
    megaStone: { "Vespiquen-Epoch": "Vespiquen-mega_epoch"},
    itemUser: ["Vespiquen-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10000,
    gen: 6,
    isNonstandard: "Past"
}
