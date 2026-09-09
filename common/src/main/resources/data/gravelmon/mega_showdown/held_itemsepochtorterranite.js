{
    name: "Epochtorterranite",
    spritenum: 620,
    megaStone: "torterra-epoch_mega",
    megaEvolves: "torterra",
    itemUser: ["torterra"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10246: 760,
    gen: 6,
    isNonstandard: "Past"
}
