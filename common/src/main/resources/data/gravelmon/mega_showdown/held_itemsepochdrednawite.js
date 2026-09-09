{
    name: "Epochdrednawite",
    spritenum: 620,
    megaStone: "drednaw-epoch_mega",
    megaEvolves: "drednaw",
    itemUser: ["drednaw"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10051: 760,
    gen: 6,
    isNonstandard: "Past"
}
