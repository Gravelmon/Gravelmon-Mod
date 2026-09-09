{
    name: "Emperieglite",
    spritenum: 620,
    megaStone: "emperiegle-mega",
    megaEvolves: "emperiegle",
    itemUser: ["emperiegle"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10132: 760,
    gen: 6,
    isNonstandard: "Past"
}
