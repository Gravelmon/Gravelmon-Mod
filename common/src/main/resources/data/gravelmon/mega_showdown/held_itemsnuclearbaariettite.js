{
    name: "Nuclearbaariettite",
    spritenum: 620,
    megaStone: "baariette-nuclear_mega",
    megaEvolves: "baariette",
    itemUser: ["baariette"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== nuclear)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10129: 760,
    gen: 6,
    isNonstandard: "Past"
}
