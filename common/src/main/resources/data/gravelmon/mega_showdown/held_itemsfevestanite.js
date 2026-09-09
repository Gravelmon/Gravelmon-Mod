{
    name: "Fevestanite",
    spritenum: 620,
    megaStone: "fevesta-mega",
    megaEvolves: "fevesta",
    itemUser: ["fevesta"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10195: 760,
    gen: 6,
    isNonstandard: "Past"
}
