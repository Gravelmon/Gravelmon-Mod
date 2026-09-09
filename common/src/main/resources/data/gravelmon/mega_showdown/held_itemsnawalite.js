{
    name: "Nawalite",
    spritenum: 620,
    megaStone: "nawale-mega",
    megaEvolves: "nawale",
    itemUser: ["nawale"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10099: 760,
    gen: 6,
    isNonstandard: "Past"
}
