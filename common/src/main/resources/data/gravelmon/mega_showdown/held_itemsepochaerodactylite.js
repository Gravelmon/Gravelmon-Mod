{
    name: "Epochaerodactylite",
    spritenum: 620,
    megaStone: "aerodactyl-epoch_mega",
    megaEvolves: "aerodactyl",
    itemUser: ["aerodactyl"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10144: 760,
    gen: 6,
    isNonstandard: "Past"
}
