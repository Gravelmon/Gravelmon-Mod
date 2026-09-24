{
    name: "Epoch dragapultite",
    spritenum: 620,
    megaStone: { "Dragapult-Epoch": "Dragapult-mega_epoch"},
    itemUser: ["Dragapult-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10144,
    gen: 6,
    isNonstandard: "Past"
}
