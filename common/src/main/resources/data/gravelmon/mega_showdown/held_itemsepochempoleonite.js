{
    name: "Epochempoleonite",
    spritenum: 620,
    megaStone: "empoleon-epoch_mega",
    megaEvolves: "empoleon",
    itemUser: ["empoleon"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10196: 760,
    gen: 6,
    isNonstandard: "Past"
}
