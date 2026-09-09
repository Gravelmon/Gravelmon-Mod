{
    name: "Epochtwoabsolite",
    spritenum: 620,
    megaStone: "absol-epochtwo_mega",
    megaEvolves: "absol",
    itemUser: ["absol"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epochtwo)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10033: 760,
    gen: 6,
    isNonstandard: "Past"
}
