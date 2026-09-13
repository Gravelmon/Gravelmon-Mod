{
    name: "Eevite",
    spritenum: 620,
    megaStone: { "Eevee": "Eevee-mega"},
    itemUser: ["Eevee"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10175,
    gen: 6,
    isNonstandard: "Past"
}
