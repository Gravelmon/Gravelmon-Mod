{
    name: "Epoch aerodactylite",
    spritenum: 620,
    megaStone: { "Aerodactyl-Epoch": "Aerodactyl-mega_epoch"},
    itemUser: ["Aerodactyl-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10143,
    gen: 6,
    isNonstandard: "Past"
}
