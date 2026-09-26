{
    name: "Helioliskite",
    spritenum: 620,
    megaStone: { "Heliolisk": "Heliolisk-mega"},
    itemUser: ["Heliolisk"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10117,
    gen: 6,
    isNonstandard: "Past"
}
