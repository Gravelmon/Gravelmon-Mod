{
    name: "Epochdugtrionite",
    spritenum: 620,
    megaStone: "dugtrio-epoch_mega",
    megaEvolves: "dugtrio",
    itemUser: ["dugtrio"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10055: 760,
    gen: 6,
    isNonstandard: "Past"
}
