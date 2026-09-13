{
    name: "Ayreian galladite",
    spritenum: 620,
    megaStone: { "Gallade-Ayreian": "Gallade-mega_ayreian"},
    itemUser: ["Gallade-Ayreian"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10114,
    gen: 6,
    isNonstandard: "Past"
}
