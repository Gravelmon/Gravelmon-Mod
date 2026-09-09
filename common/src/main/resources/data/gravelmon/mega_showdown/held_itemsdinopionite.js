{
    name: "Dinopionite",
    spritenum: 620,
    megaStone: "dinopion-mega",
    megaEvolves: "dinopion",
    itemUser: ["dinopion"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10251: 760,
    gen: 6,
    isNonstandard: "Past"
}
