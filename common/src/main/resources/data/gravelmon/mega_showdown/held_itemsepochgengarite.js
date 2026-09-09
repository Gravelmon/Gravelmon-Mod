{
    name: "Epochgengarite",
    spritenum: 620,
    megaStone: "gengar-epoch_mega",
    megaEvolves: "gengar",
    itemUser: ["gengar"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10006: 760,
    gen: 6,
    isNonstandard: "Past"
}
