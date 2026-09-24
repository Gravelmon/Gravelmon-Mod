{
    name: "Ayreian gardevoirite",
    spritenum: 620,
    megaStone: { "Gardevoir-Ayreian": "Gardevoir-mega_ayreian"},
    itemUser: ["Gardevoir-Ayreian"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10101,
    gen: 6,
    isNonstandard: "Past"
}
