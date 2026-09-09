{
    name: "Metalynxite",
    spritenum: 620,
    megaStone: "metalynx-mega",
    megaEvolves: "metalynx",
    itemUser: ["metalynx"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10095: 760,
    gen: 6,
    isNonstandard: "Past"
}
