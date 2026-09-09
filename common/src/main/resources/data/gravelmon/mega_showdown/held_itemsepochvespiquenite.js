{
    name: "Epochvespiquenite",
    spritenum: 620,
    megaStone: "vespiquen-epoch_mega",
    megaEvolves: "vespiquen",
    itemUser: ["vespiquen"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10000: 760,
    gen: 6,
    isNonstandard: "Past"
}
