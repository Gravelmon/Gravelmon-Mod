{
    name: "Ayreian absolite",
    spritenum: 620,
    megaStone: { "Absol-Ayreian": "Absol-mega_ayreian"},
    itemUser: ["Absol-Ayreian"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10031,
    gen: 6,
    isNonstandard: "Past"
}
