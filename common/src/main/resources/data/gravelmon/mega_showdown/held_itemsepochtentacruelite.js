{
    name: "Epochtentacruelite",
    spritenum: 620,
    megaStone: "tentacruel-epoch_mega",
    megaEvolves: "tentacruel",
    itemUser: ["tentacruel"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10080: 760,
    gen: 6,
    isNonstandard: "Past"
}
