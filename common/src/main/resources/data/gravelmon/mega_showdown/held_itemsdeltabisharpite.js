{
    name: "Deltabisharpite",
    spritenum: 620,
    megaStone: "bisharp-delta_mega",
    megaEvolves: "bisharp",
    itemUser: ["bisharp"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== delta)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10233: 760,
    gen: 6,
    isNonstandard: "Past"
}
