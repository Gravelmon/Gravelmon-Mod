{
    name: "S51anite",
    spritenum: 620,
    megaStone: "s51a-mega",
    megaEvolves: "s51a",
    itemUser: ["s51a"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10219: 760,
    gen: 6,
    isNonstandard: "Past"
}
