{
    name: "Epocharbokite",
    spritenum: 620,
    megaStone: "arbok-epoch_mega",
    megaEvolves: "arbok",
    itemUser: ["arbok"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10052: 760,
    gen: 6,
    isNonstandard: "Past"
}
