{
    name: "Epochtwowhimsicottite",
    spritenum: 620,
    megaStone: "whimsicott-epochtwo_mega",
    megaEvolves: "whimsicott",
    itemUser: ["whimsicott"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epochtwo)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10097: 760,
    gen: 6,
    isNonstandard: "Past"
}
