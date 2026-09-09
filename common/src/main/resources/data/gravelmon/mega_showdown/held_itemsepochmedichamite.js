{
    name: "Epochmedichamite",
    spritenum: 620,
    megaStone: "medicham-epoch_mega",
    megaEvolves: "medicham",
    itemUser: ["medicham"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10111: 760,
    gen: 6,
    isNonstandard: "Past"
}
