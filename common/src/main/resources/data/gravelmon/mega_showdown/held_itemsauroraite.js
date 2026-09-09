{
    name: "Auroraite",
    spritenum: 620,
    megaStone: "aurorai-mega",
    megaEvolves: "aurorai",
    itemUser: ["aurorai"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10040: 760,
    gen: 6,
    isNonstandard: "Past"
}
