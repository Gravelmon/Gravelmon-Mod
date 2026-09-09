{
    name: "Ayreianaerodactylite",
    spritenum: 620,
    megaStone: "aerodactyl-ayreian_mega",
    megaEvolves: "aerodactyl",
    itemUser: ["aerodactyl"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== ayreian)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10143: 760,
    gen: 6,
    isNonstandard: "Past"
}
