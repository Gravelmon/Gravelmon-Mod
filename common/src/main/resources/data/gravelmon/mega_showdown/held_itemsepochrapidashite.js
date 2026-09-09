{
    name: "Epochrapidashite",
    spritenum: 620,
    megaStone: "rapidash-epoch_mega",
    megaEvolves: "rapidash",
    itemUser: ["rapidash"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10193: 760,
    gen: 6,
    isNonstandard: "Past"
}
