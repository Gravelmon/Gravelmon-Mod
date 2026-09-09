{
    name: "Epochseismitoadite",
    spritenum: 620,
    megaStone: "seismitoad-epoch_mega",
    megaEvolves: "seismitoad",
    itemUser: ["seismitoad"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10214: 760,
    gen: 6,
    isNonstandard: "Past"
}
