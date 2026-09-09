{
    name: "Gandolphite",
    spritenum: 620,
    megaStone: "gandolph-mega",
    megaEvolves: "gandolph",
    itemUser: ["gandolph"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10093: 760,
    gen: 6,
    isNonstandard: "Past"
}
