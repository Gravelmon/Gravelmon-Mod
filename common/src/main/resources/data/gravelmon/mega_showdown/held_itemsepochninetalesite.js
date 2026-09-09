{
    name: "Epochninetalesite",
    spritenum: 620,
    megaStone: "ninetales-epoch_mega",
    megaEvolves: "ninetales",
    itemUser: ["ninetales"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10201: 760,
    gen: 6,
    isNonstandard: "Past"
}
