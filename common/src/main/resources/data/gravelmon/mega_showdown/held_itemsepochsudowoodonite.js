{
    name: "Epochsudowoodonite",
    spritenum: 620,
    megaStone: "sudowoodo-epoch_mega",
    megaEvolves: "sudowoodo",
    itemUser: ["sudowoodo"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10231: 760,
    gen: 6,
    isNonstandard: "Past"
}
