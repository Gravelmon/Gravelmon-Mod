{
    name: "Ayreianlucarionite",
    spritenum: 620,
    megaStone: "lucario-ayreian_mega",
    megaEvolves: "lucario",
    itemUser: ["lucario"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== ayreian)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10070: 760,
    gen: 6,
    isNonstandard: "Past"
}
