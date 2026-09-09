{
    name: "Epochminunite",
    spritenum: 620,
    megaStone: "minun-epoch_mega",
    megaEvolves: "minun",
    itemUser: ["minun"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10042: 760,
    gen: 6,
    isNonstandard: "Past"
}
