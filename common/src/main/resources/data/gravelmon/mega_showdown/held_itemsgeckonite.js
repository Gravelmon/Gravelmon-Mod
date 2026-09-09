{
    name: "Geckonite",
    spritenum: 620,
    megaStone: "geckone-mega",
    megaEvolves: "geckone",
    itemUser: ["geckone"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10029: 760,
    gen: 6,
    isNonstandard: "Past"
}
