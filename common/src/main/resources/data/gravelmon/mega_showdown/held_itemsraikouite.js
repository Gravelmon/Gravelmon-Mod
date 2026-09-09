{
    name: "Raikouite",
    spritenum: 620,
    megaStone: "raikou-mega",
    megaEvolves: "raikou",
    itemUser: ["raikou"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10164: 760,
    gen: 6,
    isNonstandard: "Past"
}
