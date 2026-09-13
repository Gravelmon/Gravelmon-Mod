{
    name: "Ayreian charizardite",
    spritenum: 620,
    megaStone: { "Charizard-Ayreian": "Charizard-mega_ayreian"},
    itemUser: ["Charizard-Ayreian"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10044,
    gen: 6,
    isNonstandard: "Past"
}
