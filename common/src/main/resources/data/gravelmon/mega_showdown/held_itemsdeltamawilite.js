{
    name: "Deltamawilite",
    spritenum: 620,
    megaStone: "mawile-delta_mega",
    megaEvolves: "mawile",
    itemUser: ["mawile"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== delta)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10119: 760,
    gen: 6,
    isNonstandard: "Past"
}
