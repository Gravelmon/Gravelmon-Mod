{
    name: "Epochtwogothitellite",
    spritenum: 620,
    megaStone: "gothitelle-epochtwo_mega",
    megaEvolves: "gothitelle",
    itemUser: ["gothitelle"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epochtwo)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10140: 760,
    gen: 6,
    isNonstandard: "Past"
}
