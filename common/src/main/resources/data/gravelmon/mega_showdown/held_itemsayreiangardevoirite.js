{
    name: "Ayreiangardevoirite",
    spritenum: 620,
    megaStone: "gardevoir-ayreian_mega",
    megaEvolves: "gardevoir",
    itemUser: ["gardevoir"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== ayreian)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10102: 760,
    gen: 6,
    isNonstandard: "Past"
}
