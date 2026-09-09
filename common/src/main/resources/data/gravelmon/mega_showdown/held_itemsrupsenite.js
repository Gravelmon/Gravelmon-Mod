{
    name: "Rupsenite",
    spritenum: 620,
    megaStone: "rupsen-mega",
    megaEvolves: "rupsen",
    itemUser: ["rupsen"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10202: 760,
    gen: 6,
    isNonstandard: "Past"
}
