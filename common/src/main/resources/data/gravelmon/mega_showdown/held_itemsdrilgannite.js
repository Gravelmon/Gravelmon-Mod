{
    name: "Drilgannite",
    spritenum: 620,
    megaStone: "drilgann-mega",
    megaEvolves: "drilgann",
    itemUser: ["drilgann"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10001: 760,
    gen: 6,
    isNonstandard: "Past"
}
