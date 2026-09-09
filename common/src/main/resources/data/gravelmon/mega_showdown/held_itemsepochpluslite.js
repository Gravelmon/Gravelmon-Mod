{
    name: "Epochpluslite",
    spritenum: 620,
    megaStone: "plusle-epoch_mega",
    megaEvolves: "plusle",
    itemUser: ["plusle"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10229: 760,
    gen: 6,
    isNonstandard: "Past"
}
