{
    name: "Epochtwowyrdeerite",
    spritenum: 620,
    megaStone: "wyrdeer-epochtwo_mega",
    megaEvolves: "wyrdeer",
    itemUser: ["wyrdeer"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epochtwo)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10176: 760,
    gen: 6,
    isNonstandard: "Past"
}
