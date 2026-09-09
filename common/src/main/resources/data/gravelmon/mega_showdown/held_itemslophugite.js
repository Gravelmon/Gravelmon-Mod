{
    name: "Lophugite",
    spritenum: 620,
    megaStone: "lophug-mega",
    megaEvolves: "lophug",
    itemUser: ["lophug"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10011: 760,
    gen: 6,
    isNonstandard: "Past"
}
