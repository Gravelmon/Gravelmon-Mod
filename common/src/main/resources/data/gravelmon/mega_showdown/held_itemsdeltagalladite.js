{
    name: "Deltagalladite",
    spritenum: 620,
    megaStone: "gallade-delta_mega",
    megaEvolves: "gallade",
    itemUser: ["gallade"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== delta)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10113: 760,
    gen: 6,
    isNonstandard: "Past"
}
