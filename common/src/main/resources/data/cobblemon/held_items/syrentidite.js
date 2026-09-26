{
    name: "Syrentidite",
    spritenum: 620,
    megaStone: { "Syrentide": "Syrentide-mega"},
    itemUser: ["Syrentide"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10147,
    gen: 6,
    isNonstandard: "Past"
}
