{
    name: "Kiricornite",
    spritenum: 620,
    megaStone: "kiricorn-mega",
    megaEvolves: "kiricorn",
    itemUser: ["kiricorn"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10168: 760,
    gen: 6,
    isNonstandard: "Past"
}
