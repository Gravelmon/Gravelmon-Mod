{
    name: "Epochinfernapite",
    spritenum: 620,
    megaStone: "infernape-epoch_mega",
    megaEvolves: "infernape",
    itemUser: ["infernape"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10181: 760,
    gen: 6,
    isNonstandard: "Past"
}
