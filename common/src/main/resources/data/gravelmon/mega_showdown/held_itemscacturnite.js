{
    name: "Cacturnite",
    spritenum: 620,
    megaStone: "cacturne-mega",
    megaEvolves: "cacturne",
    itemUser: ["cacturne"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10022: 760,
    gen: 6,
    isNonstandard: "Past"
}
