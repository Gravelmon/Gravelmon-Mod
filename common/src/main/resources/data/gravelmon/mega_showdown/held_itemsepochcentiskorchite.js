{
    name: "Epochcentiskorchite",
    spritenum: 620,
    megaStone: "centiskorch-epoch_mega",
    megaEvolves: "centiskorch",
    itemUser: ["centiskorch"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10199: 760,
    gen: 6,
    isNonstandard: "Past"
}
