{
    name: "Marowakite",
    spritenum: 620,
    megaStone: "marowak-mega",
    megaEvolves: "marowak",
    itemUser: ["marowak"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10068: 760,
    gen: 6,
    isNonstandard: "Past"
}
