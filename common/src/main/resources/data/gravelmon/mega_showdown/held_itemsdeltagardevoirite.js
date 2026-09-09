{
    name: "Deltagardevoirite",
    spritenum: 620,
    megaStone: "gardevoir-delta_mega",
    megaEvolves: "gardevoir",
    itemUser: ["gardevoir"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== delta)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10101: 760,
    gen: 6,
    isNonstandard: "Past"
}
