{
    name: "Epochpidgeotite",
    spritenum: 620,
    megaStone: "pidgeot-epoch_mega",
    megaEvolves: "pidgeot",
    itemUser: ["pidgeot"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10126: 760,
    gen: 6,
    isNonstandard: "Past"
}
