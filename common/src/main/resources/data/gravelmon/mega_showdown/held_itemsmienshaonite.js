{
    name: "Mienshaonite",
    spritenum: 620,
    megaStone: "mienshao-mega",
    megaEvolves: "mienshao",
    itemUser: ["mienshao"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10238: 760,
    gen: 6,
    isNonstandard: "Past"
}
