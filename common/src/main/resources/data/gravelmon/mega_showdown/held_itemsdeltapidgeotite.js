{
    name: "Deltapidgeotite",
    spritenum: 620,
    megaStone: "pidgeot-delta_mega",
    megaEvolves: "pidgeot",
    itemUser: ["pidgeot"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== delta)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10125: 760,
    gen: 6,
    isNonstandard: "Past"
}
