{
    name: "Epochmachampite",
    spritenum: 620,
    megaStone: "machamp-epoch_mega",
    megaEvolves: "machamp",
    itemUser: ["machamp"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10162: 760,
    gen: 6,
    isNonstandard: "Past"
}
