{
    name: "Epochtsareenanite",
    spritenum: 620,
    megaStone: "tsareena-epoch_mega",
    megaEvolves: "tsareena",
    itemUser: ["tsareena"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10020: 760,
    gen: 6,
    isNonstandard: "Past"
}
