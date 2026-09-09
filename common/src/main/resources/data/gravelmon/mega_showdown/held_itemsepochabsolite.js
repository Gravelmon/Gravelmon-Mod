{
    name: "Epochabsolite",
    spritenum: 620,
    megaStone: "absol-epoch_mega",
    megaEvolves: "absol",
    itemUser: ["absol"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10032: 760,
    gen: 6,
    isNonstandard: "Past"
}
