{
    name: "Rushotite",
    spritenum: 620,
    megaStone: "rushot-mega",
    megaEvolves: "rushot",
    itemUser: ["rushot"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10084: 760,
    gen: 6,
    isNonstandard: "Past"
}
