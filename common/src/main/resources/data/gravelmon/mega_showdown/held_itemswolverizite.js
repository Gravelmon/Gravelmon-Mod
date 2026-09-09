{
    name: "Wolverizite",
    spritenum: 620,
    megaStone: "wolverize-mega",
    megaEvolves: "wolverize",
    itemUser: ["wolverize"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10124: 760,
    gen: 6,
    isNonstandard: "Past"
}
