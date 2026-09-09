{
    name: "Epochtwocacturnite",
    spritenum: 620,
    megaStone: "cacturne-epochtwo_mega",
    megaEvolves: "cacturne",
    itemUser: ["cacturne"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epochtwo)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10023: 760,
    gen: 6,
    isNonstandard: "Past"
}
