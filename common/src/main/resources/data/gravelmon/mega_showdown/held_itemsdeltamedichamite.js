{
    name: "Deltamedichamite",
    spritenum: 620,
    megaStone: "medicham-delta_mega",
    megaEvolves: "medicham",
    itemUser: ["medicham"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== delta)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10110: 760,
    gen: 6,
    isNonstandard: "Past"
}
