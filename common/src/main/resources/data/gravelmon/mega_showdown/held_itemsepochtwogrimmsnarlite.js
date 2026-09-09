{
    name: "Epochtwogrimmsnarlite",
    spritenum: 620,
    megaStone: "grimmsnarl-epochtwo_mega",
    megaEvolves: "grimmsnarl",
    itemUser: ["grimmsnarl"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epochtwo)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10013: 760,
    gen: 6,
    isNonstandard: "Past"
}
