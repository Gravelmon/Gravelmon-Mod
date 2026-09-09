{
    name: "Epochampharosite",
    spritenum: 620,
    megaStone: "ampharos-epoch_mega",
    megaEvolves: "ampharos",
    itemUser: ["ampharos"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10207: 760,
    gen: 6,
    isNonstandard: "Past"
}
