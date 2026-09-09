{
    name: "Yanpaowite",
    spritenum: 620,
    megaStone: "yanpaow-mega",
    megaEvolves: "yanpaow",
    itemUser: ["yanpaow"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10056: 760,
    gen: 6,
    isNonstandard: "Past"
}
