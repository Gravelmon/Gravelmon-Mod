{
    name: "Epochsharpedonite",
    spritenum: 620,
    megaStone: "sharpedo-epoch_mega",
    megaEvolves: "sharpedo",
    itemUser: ["sharpedo"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10021: 760,
    gen: 6,
    isNonstandard: "Past"
}
