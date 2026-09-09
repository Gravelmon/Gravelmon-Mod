{
    name: "Epochchandelurite",
    spritenum: 620,
    megaStone: "chandelure-epoch_mega",
    megaEvolves: "chandelure",
    itemUser: ["chandelure"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10089: 760,
    gen: 6,
    isNonstandard: "Past"
}
