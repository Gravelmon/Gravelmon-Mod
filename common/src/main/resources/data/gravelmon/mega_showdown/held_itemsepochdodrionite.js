{
    name: "Epochdodrionite",
    spritenum: 620,
    megaStone: "dodrio-epoch_mega",
    megaEvolves: "dodrio",
    itemUser: ["dodrio"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10225: 760,
    gen: 6,
    isNonstandard: "Past"
}
