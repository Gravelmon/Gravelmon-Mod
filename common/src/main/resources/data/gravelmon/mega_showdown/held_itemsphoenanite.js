{
    name: "Phoenanite",
    spritenum: 620,
    megaStone: "phoenan-mega",
    megaEvolves: "phoenan",
    itemUser: ["phoenan"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10141: 760,
    gen: 6,
    isNonstandard: "Past"
}
