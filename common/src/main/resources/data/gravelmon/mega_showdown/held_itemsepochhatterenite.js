{
    name: "Epochhatterenite",
    spritenum: 620,
    megaStone: "hatterene-epoch_mega",
    megaEvolves: "hatterene",
    itemUser: ["hatterene"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10184: 760,
    gen: 6,
    isNonstandard: "Past"
}
