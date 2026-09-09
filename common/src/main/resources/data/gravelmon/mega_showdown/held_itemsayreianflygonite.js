{
    name: "Ayreianflygonite",
    spritenum: 620,
    megaStone: "flygon-ayreian_mega",
    megaEvolves: "flygon",
    itemUser: ["flygon"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== ayreian)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10151: 760,
    gen: 6,
    isNonstandard: "Past"
}
