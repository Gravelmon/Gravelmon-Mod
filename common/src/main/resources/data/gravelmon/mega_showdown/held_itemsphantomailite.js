{
    name: "Phantomailite",
    spritenum: 620,
    megaStone: "phantomail-mega",
    megaEvolves: "phantomail",
    itemUser: ["phantomail"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10066: 760,
    gen: 6,
    isNonstandard: "Past"
}
