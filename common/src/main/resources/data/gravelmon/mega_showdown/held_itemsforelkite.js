{
    name: "Forelkite",
    spritenum: 620,
    megaStone: "forelk-mega",
    megaEvolves: "forelk",
    itemUser: ["forelk"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10187: 760,
    gen: 6,
    isNonstandard: "Past"
}
