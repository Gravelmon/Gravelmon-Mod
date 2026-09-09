{
    name: "Epochursalunanite",
    spritenum: 620,
    megaStone: "ursaluna-epoch_mega",
    megaEvolves: "ursaluna",
    itemUser: ["ursaluna"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10157: 760,
    gen: 6,
    isNonstandard: "Past"
}
