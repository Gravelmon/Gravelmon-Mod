{
    name: "Deltacameruptite",
    spritenum: 620,
    megaStone: "camerupt-delta_mega",
    megaEvolves: "camerupt",
    itemUser: ["camerupt"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== delta)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10240: 760,
    gen: 6,
    isNonstandard: "Past"
}
