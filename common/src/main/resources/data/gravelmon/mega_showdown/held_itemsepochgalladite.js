{
    name: "Epochgalladite",
    spritenum: 620,
    megaStone: "gallade-epoch_mega",
    megaEvolves: "gallade",
    itemUser: ["gallade"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10115: 760,
    gen: 6,
    isNonstandard: "Past"
}
