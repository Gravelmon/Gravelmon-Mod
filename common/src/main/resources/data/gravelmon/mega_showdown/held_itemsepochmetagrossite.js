{
    name: "Epochmetagrossite",
    spritenum: 620,
    megaStone: "metagross-epoch_mega",
    megaEvolves: "metagross",
    itemUser: ["metagross"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10245: 760,
    gen: 6,
    isNonstandard: "Past"
}
