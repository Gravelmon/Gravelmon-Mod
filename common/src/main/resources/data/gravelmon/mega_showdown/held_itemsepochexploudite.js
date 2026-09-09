{
    name: "Epochexploudite",
    spritenum: 620,
    megaStone: "exploud-epoch_mega",
    megaEvolves: "exploud",
    itemUser: ["exploud"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10161: 760,
    gen: 6,
    isNonstandard: "Past"
}
