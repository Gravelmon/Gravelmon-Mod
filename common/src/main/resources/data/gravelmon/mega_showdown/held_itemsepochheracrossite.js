{
    name: "Epochheracrossite",
    spritenum: 620,
    megaStone: "heracross-epoch_mega",
    megaEvolves: "heracross",
    itemUser: ["heracross"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10083: 760,
    gen: 6,
    isNonstandard: "Past"
}
