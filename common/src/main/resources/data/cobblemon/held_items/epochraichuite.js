{
    name: "Epoch raichuite",
    spritenum: 620,
    megaStone: { "Raichu-Epoch": "Raichu-mega_epoch"},
    itemUser: ["Raichu-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10030,
    gen: 6,
    isNonstandard: "Past"
}
