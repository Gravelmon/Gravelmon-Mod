{
    name: "Ayreian flygonite",
    spritenum: 620,
    megaStone: { "Flygon-Ayreian": "Flygon-mega_ayreian"},
    itemUser: ["Flygon-Ayreian"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10148,
    gen: 6,
    isNonstandard: "Past"
}
