{
    name: "Bisharpite",
    spritenum: 620,
    megaStone: "bisharp-mega",
    megaEvolves: "bisharp",
    itemUser: ["bisharp"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10232: 760,
    gen: 6,
    isNonstandard: "Past"
}
