{
    name: "Emporeelite",
    spritenum: 620,
    megaStone: "emporeel-mega",
    megaEvolves: "emporeel",
    itemUser: ["emporeel"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10007: 760,
    gen: 6,
    isNonstandard: "Past"
}
