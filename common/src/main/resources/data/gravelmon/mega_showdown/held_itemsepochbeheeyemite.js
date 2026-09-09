{
    name: "Epochbeheeyemite",
    spritenum: 620,
    megaStone: "beheeyem-epoch_mega",
    megaEvolves: "beheeyem",
    itemUser: ["beheeyem"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10134: 760,
    gen: 6,
    isNonstandard: "Past"
}
