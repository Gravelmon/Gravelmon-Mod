{
    name: "Epochabomasnowite",
    spritenum: 620,
    megaStone: "abomasnow-epoch_mega",
    megaEvolves: "abomasnow",
    itemUser: ["abomasnow"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10077: 760,
    gen: 6,
    isNonstandard: "Past"
}
