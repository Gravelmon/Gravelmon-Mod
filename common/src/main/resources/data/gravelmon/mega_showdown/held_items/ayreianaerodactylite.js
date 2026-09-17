{
    name: "Ayreian aerodactylite",
    spritenum: 620,
    megaStone: { "Aerodactyl-Ayreian": "Aerodactyl-mega_ayreian"},
    itemUser: ["Aerodactyl-Ayreian"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10141,
    gen: 6,
    isNonstandard: "Past"
}
