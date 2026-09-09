{
    name: "Nucleargyaradosite",
    spritenum: 620,
    megaStone: "gyarados-nuclear_mega",
    megaEvolves: "gyarados",
    itemUser: ["gyarados"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== nuclear)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10009: 760,
    gen: 6,
    isNonstandard: "Past"
}
