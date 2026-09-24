{
    name: "Epoch gliscorite",
    spritenum: 620,
    megaStone: { "Gliscor-Epoch": "Gliscor-mega_epoch"},
    itemUser: ["Gliscor-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10108,
    gen: 6,
    isNonstandard: "Past"
}
