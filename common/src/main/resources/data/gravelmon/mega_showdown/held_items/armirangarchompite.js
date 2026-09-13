{
    name: "Armiran garchompite",
    spritenum: 620,
    megaStone: { "Garchomp-Armiran": "Garchomp-mega_armiran"},
    itemUser: ["Garchomp-Armiran"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10146,
    gen: 6,
    isNonstandard: "Past"
}
