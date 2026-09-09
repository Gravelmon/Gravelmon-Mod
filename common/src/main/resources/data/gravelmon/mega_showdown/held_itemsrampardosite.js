{
    name: "Rampardosite",
    spritenum: 620,
    megaStone: "rampardos-mega",
    megaEvolves: "rampardos",
    itemUser: ["rampardos"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10234: 760,
    gen: 6,
    isNonstandard: "Past"
}
