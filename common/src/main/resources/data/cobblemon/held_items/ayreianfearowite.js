{
    name: "Ayreian fearowite",
    spritenum: 620,
    megaStone: { "Fearow-Ayreian": "Fearow-mega_ayreian"},
    itemUser: ["Fearow-Ayreian"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10119,
    gen: 6,
    isNonstandard: "Past"
}
