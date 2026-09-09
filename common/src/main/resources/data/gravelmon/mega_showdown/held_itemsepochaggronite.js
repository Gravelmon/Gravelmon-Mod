{
    name: "Epochaggronite",
    spritenum: 620,
    megaStone: "aggron-epoch_mega",
    megaEvolves: "aggron",
    itemUser: ["aggron"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10037: 760,
    gen: 6,
    isNonstandard: "Past"
}
