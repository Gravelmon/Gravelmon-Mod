{
    name: "Baariettite",
    spritenum: 620,
    megaStone: "baariette-mega",
    megaEvolves: "baariette",
    itemUser: ["baariette"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10128: 760,
    gen: 6,
    isNonstandard: "Past"
}
