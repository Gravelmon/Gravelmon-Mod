{
    name: "Epochcorviknightite",
    spritenum: 620,
    megaStone: "corviknight-epoch_mega",
    megaEvolves: "corviknight",
    itemUser: ["corviknight"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10182: 760,
    gen: 6,
    isNonstandard: "Past"
}
