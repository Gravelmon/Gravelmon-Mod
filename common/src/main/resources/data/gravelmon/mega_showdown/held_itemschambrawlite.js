{
    name: "Chambrawlite",
    spritenum: 620,
    megaStone: "chambrawl-mega",
    megaEvolves: "chambrawl",
    itemUser: ["chambrawl"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10171: 760,
    gen: 6,
    isNonstandard: "Past"
}
