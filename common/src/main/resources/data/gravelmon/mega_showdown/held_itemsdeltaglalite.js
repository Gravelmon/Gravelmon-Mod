{
    name: "Deltaglalite",
    spritenum: 620,
    megaStone: "glalie-delta_mega",
    megaEvolves: "glalie",
    itemUser: ["glalie"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== delta)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10154: 760,
    gen: 6,
    isNonstandard: "Past"
}
