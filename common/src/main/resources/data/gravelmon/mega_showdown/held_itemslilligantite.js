{
    name: "Lilligantite",
    spritenum: 620,
    megaStone: "lilligant-mega",
    megaEvolves: "lilligant",
    itemUser: ["lilligant"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10248: 760,
    gen: 6,
    isNonstandard: "Past"
}
