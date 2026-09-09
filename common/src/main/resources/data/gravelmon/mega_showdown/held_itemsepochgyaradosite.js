{
    name: "Epochgyaradosite",
    spritenum: 620,
    megaStone: "gyarados-epoch_mega",
    megaEvolves: "gyarados",
    itemUser: ["gyarados"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10008: 760,
    gen: 6,
    isNonstandard: "Past"
}
