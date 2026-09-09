{
    name: "Epochblisseyite",
    spritenum: 620,
    megaStone: "blissey-epoch_mega",
    megaEvolves: "blissey",
    itemUser: ["blissey"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10092: 760,
    gen: 6,
    isNonstandard: "Past"
}
