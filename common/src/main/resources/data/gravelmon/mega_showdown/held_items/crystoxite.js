{
    name: "Crystoxite",
    spritenum: 620,
    megaStone: { "Crystox": "Crystox-mega"},
    itemUser: ["Crystox"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10074,
    gen: 6,
    isNonstandard: "Past"
}
