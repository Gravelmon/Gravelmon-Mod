{
    name: "Enteite",
    spritenum: 620,
    megaStone: "entei-mega",
    megaEvolves: "entei",
    itemUser: ["entei"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10153: 760,
    gen: 6,
    isNonstandard: "Past"
}
