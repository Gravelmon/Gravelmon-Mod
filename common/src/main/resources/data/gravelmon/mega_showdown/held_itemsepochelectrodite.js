{
    name: "Epochelectrodite",
    spritenum: 620,
    megaStone: "electrode-epoch_mega",
    megaEvolves: "electrode",
    itemUser: ["electrode"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10227: 760,
    gen: 6,
    isNonstandard: "Past"
}
