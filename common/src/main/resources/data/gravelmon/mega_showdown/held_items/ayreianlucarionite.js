{
    name: "Ayreian lucarionite",
    spritenum: 620,
    megaStone: { "Lucario-Ayreian": "Lucario-mega_ayreian"},
    itemUser: ["Lucario-Ayreian"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10070,
    gen: 6,
    isNonstandard: "Past"
}
