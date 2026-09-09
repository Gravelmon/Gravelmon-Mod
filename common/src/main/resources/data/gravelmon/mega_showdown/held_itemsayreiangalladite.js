{
    name: "Ayreiangalladite",
    spritenum: 620,
    megaStone: "gallade-ayreian_mega",
    megaEvolves: "gallade",
    itemUser: ["gallade"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== ayreian)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10114: 760,
    gen: 6,
    isNonstandard: "Past"
}
