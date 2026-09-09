{
    name: "Deltamilotite",
    spritenum: 620,
    megaStone: "milotic-delta_mega",
    megaEvolves: "milotic",
    itemUser: ["milotic"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== delta)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10179: 760,
    gen: 6,
    isNonstandard: "Past"
}
