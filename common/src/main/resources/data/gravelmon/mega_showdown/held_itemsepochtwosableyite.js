{
    name: "Epochtwosableyite",
    spritenum: 620,
    megaStone: "sableye-epochtwo_mega",
    megaEvolves: "sableye",
    itemUser: ["sableye"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epochtwo)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10088: 760,
    gen: 6,
    isNonstandard: "Past"
}
