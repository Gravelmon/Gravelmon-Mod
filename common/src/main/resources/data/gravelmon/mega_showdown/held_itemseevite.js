{
    name: "Eevite",
    spritenum: 620,
    megaStone: "eevee-mega",
    megaEvolves: "eevee",
    itemUser: ["eevee"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10175: 760,
    gen: 6,
    isNonstandard: "Past"
}
