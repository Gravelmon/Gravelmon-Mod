{
    name: "Morphiasite",
    spritenum: 620,
    megaStone: "morphias-mega",
    megaEvolves: "morphias",
    itemUser: ["morphias"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10218: 760,
    gen: 6,
    isNonstandard: "Past"
}
