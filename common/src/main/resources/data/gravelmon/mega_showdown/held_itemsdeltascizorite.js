{
    name: "Deltascizorite",
    spritenum: 620,
    megaStone: "scizor-delta_mega",
    megaEvolves: "scizor",
    itemUser: ["scizor"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== delta)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10116: 760,
    gen: 6,
    isNonstandard: "Past"
}
