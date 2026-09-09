{
    name: "Nucleararbokite",
    spritenum: 620,
    megaStone: "arbok-nuclear_mega",
    megaEvolves: "arbok",
    itemUser: ["arbok"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== nuclear)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10054: 760,
    gen: 6,
    isNonstandard: "Past"
}
