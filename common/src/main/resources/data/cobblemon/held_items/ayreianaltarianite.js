{
    name: "Ayreian altarianite",
    spritenum: 620,
    megaStone: { "Altaria-Ayreian": "Altaria-mega_ayreian"},
    itemUser: ["Altaria-Ayreian"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10016,
    gen: 6,
    isNonstandard: "Past"
}
