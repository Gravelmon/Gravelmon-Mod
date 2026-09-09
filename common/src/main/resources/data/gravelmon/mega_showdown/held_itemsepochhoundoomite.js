{
    name: "Epochhoundoomite",
    spritenum: 620,
    megaStone: "houndoom-epoch_mega",
    megaEvolves: "houndoom",
    itemUser: ["houndoom"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10108: 760,
    gen: 6,
    isNonstandard: "Past"
}
