{
    name: "Skeledeepite",
    spritenum: 620,
    megaStone: "skeledeep-mega",
    megaEvolves: "skeledeep",
    itemUser: ["skeledeep"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10203: 760,
    gen: 6,
    isNonstandard: "Past"
}
