{
    name: "Epoch emolganite",
    spritenum: 620,
    megaStone: { "Emolga-Epoch": "Emolga-mega_epoch"},
    itemUser: ["Emolga-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10085,
    gen: 6,
    isNonstandard: "Past"
}
