{
    name: "Razorvilite",
    spritenum: 620,
    megaStone: "razorvile-mega",
    megaEvolves: "razorvile",
    itemUser: ["razorvile"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10226: 760,
    gen: 6,
    isNonstandard: "Past"
}
