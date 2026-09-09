{
    name: "Jayzurite",
    spritenum: 620,
    megaStone: "jayzure-mega",
    megaEvolves: "jayzure",
    itemUser: ["jayzure"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10063: 760,
    gen: 6,
    isNonstandard: "Past"
}
