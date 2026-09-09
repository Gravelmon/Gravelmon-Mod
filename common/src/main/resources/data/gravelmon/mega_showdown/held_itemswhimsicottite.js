{
    name: "Whimsicottite",
    spritenum: 620,
    megaStone: "whimsicott-mega",
    megaEvolves: "whimsicott",
    itemUser: ["whimsicott"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10098: 760,
    gen: 6,
    isNonstandard: "Past"
}
