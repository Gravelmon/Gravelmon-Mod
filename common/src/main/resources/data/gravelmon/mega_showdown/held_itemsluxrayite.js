{
    name: "Luxrayite",
    spritenum: 620,
    megaStone: "luxray-mega",
    megaEvolves: "luxray",
    itemUser: ["luxray"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10177: 760,
    gen: 6,
    isNonstandard: "Past"
}
