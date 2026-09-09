{
    name: "Epochbanettite",
    spritenum: 620,
    megaStone: "banette-epoch_mega",
    megaEvolves: "banette",
    itemUser: ["banette"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10004: 760,
    gen: 6,
    isNonstandard: "Past"
}
