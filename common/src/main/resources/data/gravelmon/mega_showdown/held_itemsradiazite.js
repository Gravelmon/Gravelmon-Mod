{
    name: "Radiazite",
    spritenum: 620,
    megaStone: "radiaze-mega",
    megaEvolves: "radiaze",
    itemUser: ["radiaze"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10057: 760,
    gen: 6,
    isNonstandard: "Past"
}
