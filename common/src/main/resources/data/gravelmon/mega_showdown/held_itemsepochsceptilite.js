{
    name: "Epochsceptilite",
    spritenum: 620,
    megaStone: "sceptile-epoch_mega",
    megaEvolves: "sceptile",
    itemUser: ["sceptile"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10217: 760,
    gen: 6,
    isNonstandard: "Past"
}
