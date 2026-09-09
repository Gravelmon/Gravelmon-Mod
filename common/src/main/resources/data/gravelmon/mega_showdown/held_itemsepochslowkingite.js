{
    name: "Epochslowkingite",
    spritenum: 620,
    megaStone: "slowking-epoch_mega",
    megaEvolves: "slowking",
    itemUser: ["slowking"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10059: 760,
    gen: 6,
    isNonstandard: "Past"
}
