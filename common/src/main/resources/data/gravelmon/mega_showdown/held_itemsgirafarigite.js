{
    name: "Girafarigite",
    spritenum: 620,
    megaStone: "girafarig-mega",
    megaEvolves: "girafarig",
    itemUser: ["girafarig"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10027: 760,
    gen: 6,
    isNonstandard: "Past"
}
