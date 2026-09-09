{
    name: "Epochtwoaltarianite",
    spritenum: 620,
    megaStone: "altaria-epochtwo_mega",
    megaEvolves: "altaria",
    itemUser: ["altaria"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epochtwo)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10018: 760,
    gen: 6,
    isNonstandard: "Past"
}
