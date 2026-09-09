{
    name: "Armiransceptilite",
    spritenum: 620,
    megaStone: "sceptile-armiran_mega",
    megaEvolves: "sceptile",
    itemUser: ["sceptile"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== armiran)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10216: 760,
    gen: 6,
    isNonstandard: "Past"
}
