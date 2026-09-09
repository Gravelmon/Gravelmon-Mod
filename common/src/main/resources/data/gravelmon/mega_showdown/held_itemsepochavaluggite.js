{
    name: "Epochavaluggite",
    spritenum: 620,
    megaStone: "avalugg-epoch_mega",
    megaEvolves: "avalugg",
    itemUser: ["avalugg"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10127: 760,
    gen: 6,
    isNonstandard: "Past"
}
