{
    name: "Epochglalite",
    spritenum: 620,
    megaStone: "glalie-epoch_mega",
    megaEvolves: "glalie",
    itemUser: ["glalie"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10155: 760,
    gen: 6,
    isNonstandard: "Past"
}
