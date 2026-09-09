{
    name: "Epochdonphanite",
    spritenum: 620,
    megaStone: "donphan-epoch_mega",
    megaEvolves: "donphan",
    itemUser: ["donphan"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10065: 760,
    gen: 6,
    isNonstandard: "Past"
}
