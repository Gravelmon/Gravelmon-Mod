{
    name: "Epochcofagrigusite",
    spritenum: 620,
    megaStone: "cofagrigus-epoch_mega",
    megaEvolves: "cofagrigus",
    itemUser: ["cofagrigus"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10222: 760,
    gen: 6,
    isNonstandard: "Past"
}
