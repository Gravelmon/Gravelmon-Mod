{
    name: "Zoroarkite",
    spritenum: 620,
    megaStone: "zoroark-mega",
    megaEvolves: "zoroark",
    itemUser: ["zoroark"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10197: 760,
    gen: 6,
    isNonstandard: "Past"
}
