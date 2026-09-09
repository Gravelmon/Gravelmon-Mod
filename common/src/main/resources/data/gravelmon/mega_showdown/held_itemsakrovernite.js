{
    name: "Akrovernite",
    spritenum: 620,
    megaStone: "akrovern-mega",
    megaEvolves: "akrovern",
    itemUser: ["akrovern"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10148: 760,
    gen: 6,
    isNonstandard: "Past"
}
