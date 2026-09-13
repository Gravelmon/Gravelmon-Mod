{
    name: "Delta lucarionite",
    spritenum: 620,
    megaStone: { "Lucario-Delta": "Lucario-mega_delta"},
    itemUser: ["Lucario-Delta"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10069,
    gen: 6,
    isNonstandard: "Past"
}
