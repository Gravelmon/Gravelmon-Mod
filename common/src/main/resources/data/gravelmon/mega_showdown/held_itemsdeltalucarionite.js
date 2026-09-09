{
    name: "Deltalucarionite",
    spritenum: 620,
    megaStone: "lucario-delta_mega",
    megaEvolves: "lucario",
    itemUser: ["lucario"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== delta)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10069: 760,
    gen: 6,
    isNonstandard: "Past"
}
