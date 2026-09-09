{
    name: "Epochfalinksite",
    spritenum: 620,
    megaStone: "falinks-epoch_mega",
    megaEvolves: "falinks",
    itemUser: ["falinks"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10107: 760,
    gen: 6,
    isNonstandard: "Past"
}
