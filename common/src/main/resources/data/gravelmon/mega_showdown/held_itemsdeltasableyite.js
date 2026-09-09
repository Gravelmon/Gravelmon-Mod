{
    name: "Deltasableyite",
    spritenum: 620,
    megaStone: "sableye-delta_mega",
    megaEvolves: "sableye",
    itemUser: ["sableye"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== delta)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10086: 760,
    gen: 6,
    isNonstandard: "Past"
}
