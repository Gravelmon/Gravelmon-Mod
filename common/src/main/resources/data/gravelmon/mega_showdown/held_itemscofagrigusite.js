{
    name: "Cofagrigusite",
    spritenum: 620,
    megaStone: "cofagrigus-mega",
    megaEvolves: "cofagrigus",
    itemUser: ["cofagrigus"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10223: 760,
    gen: 6,
    isNonstandard: "Past"
}
