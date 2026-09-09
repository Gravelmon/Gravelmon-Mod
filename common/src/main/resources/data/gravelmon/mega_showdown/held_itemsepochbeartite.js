{
    name: "Epochbeartite",
    spritenum: 620,
    megaStone: "beartic-epoch_mega",
    megaEvolves: "beartic",
    itemUser: ["beartic"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10036: 760,
    gen: 6,
    isNonstandard: "Past"
}
