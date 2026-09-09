{
    name: "Caramelixite",
    spritenum: 620,
    megaStone: "caramelix-mega",
    megaEvolves: "caramelix",
    itemUser: ["caramelix"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10012: 760,
    gen: 6,
    isNonstandard: "Past"
}
