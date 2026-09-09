{
    name: "Epochstarmite",
    spritenum: 620,
    megaStone: "starmie-epoch_mega",
    megaEvolves: "starmie",
    itemUser: ["starmie"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10048: 760,
    gen: 6,
    isNonstandard: "Past"
}
