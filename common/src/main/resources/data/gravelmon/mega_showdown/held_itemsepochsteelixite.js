{
    name: "Epochsteelixite",
    spritenum: 620,
    megaStone: "steelix-epoch_mega",
    megaEvolves: "steelix",
    itemUser: ["steelix"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10166: 760,
    gen: 6,
    isNonstandard: "Past"
}
