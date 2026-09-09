{
    name: "Gothitellite",
    spritenum: 620,
    megaStone: "gothitelle-mega",
    megaEvolves: "gothitelle",
    itemUser: ["gothitelle"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10138: 760,
    gen: 6,
    isNonstandard: "Past"
}
