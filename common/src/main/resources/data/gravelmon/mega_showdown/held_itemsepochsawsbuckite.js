{
    name: "Epochsawsbuckite",
    spritenum: 620,
    megaStone: "sawsbuck-epoch_mega",
    megaEvolves: "sawsbuck",
    itemUser: ["sawsbuck"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10035: 760,
    gen: 6,
    isNonstandard: "Past"
}
