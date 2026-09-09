{
    name: "Sudowoodonite",
    spritenum: 620,
    megaStone: "sudowoodo-mega",
    megaEvolves: "sudowoodo",
    itemUser: ["sudowoodo"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10230: 760,
    gen: 6,
    isNonstandard: "Past"
}
