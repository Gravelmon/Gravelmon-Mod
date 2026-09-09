{
    name: "Epochgothitellite",
    spritenum: 620,
    megaStone: "gothitelle-epoch_mega",
    megaEvolves: "gothitelle",
    itemUser: ["gothitelle"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10139: 760,
    gen: 6,
    isNonstandard: "Past"
}
