{
    name: "Ekiamanite",
    spritenum: 620,
    megaStone: { "Ekiama": "Ekiama-mega"},
    itemUser: ["Ekiama"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10024,
    gen: 6,
    isNonstandard: "Past"
}
