{
    name: "Weavilite",
    spritenum: 620,
    megaStone: { "Weavile": "Weavile-mega"},
    itemUser: ["Weavile"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10225,
    gen: 6,
    isNonstandard: "Past"
}
