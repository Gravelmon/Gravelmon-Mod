{
    name: "Epochsableyite",
    spritenum: 620,
    megaStone: "sableye-epoch_mega",
    megaEvolves: "sableye",
    itemUser: ["sableye"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10087: 760,
    gen: 6,
    isNonstandard: "Past"
}
