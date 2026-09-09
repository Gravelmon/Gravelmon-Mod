{
    name: "Deltagirafarigite",
    spritenum: 620,
    megaStone: "girafarig-delta_mega",
    megaEvolves: "girafarig",
    itemUser: ["girafarig"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== delta)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10028: 760,
    gen: 6,
    isNonstandard: "Past"
}
