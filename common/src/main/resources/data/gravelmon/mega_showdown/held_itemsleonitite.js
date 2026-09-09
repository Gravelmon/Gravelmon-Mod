{
    name: "Leonitite",
    spritenum: 620,
    megaStone: "leonite-mega",
    megaEvolves: "leonite",
    itemUser: ["leonite"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10174: 760,
    gen: 6,
    isNonstandard: "Past"
}
