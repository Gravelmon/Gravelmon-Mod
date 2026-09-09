{
    name: "Crystalfragment",
    spritenum: 620,
    megaStone: "metagross-delta_crystal_mega",
    megaEvolves: "metagross",
    itemUser: ["metagross"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== delta crystal)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10244: 760,
    gen: 6,
    isNonstandard: "Past"
}
