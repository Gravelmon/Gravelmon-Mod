{
    name: "Epochmismagiusite",
    spritenum: 620,
    megaStone: "mismagius-epoch_mega",
    megaEvolves: "mismagius",
    itemUser: ["mismagius"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10131: 760,
    gen: 6,
    isNonstandard: "Past"
}
