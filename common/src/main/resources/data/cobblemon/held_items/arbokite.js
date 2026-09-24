{
    name: "Arbokite",
    spritenum: 620,
    megaStone: { "Arbok": "Arbok-mega"},
    itemUser: ["Arbok"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10053,
    gen: 6,
    isNonstandard: "Past"
}
