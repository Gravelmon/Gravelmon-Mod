{
    name: "Epochtwoursalunanite",
    spritenum: 620,
    megaStone: "ursaluna-epochtwo_mega",
    megaEvolves: "ursaluna",
    itemUser: ["ursaluna"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epochtwo)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10158: 760,
    gen: 6,
    isNonstandard: "Past"
}
