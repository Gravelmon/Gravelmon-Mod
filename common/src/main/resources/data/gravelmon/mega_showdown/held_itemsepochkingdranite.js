{
    name: "Epochkingdranite",
    spritenum: 620,
    megaStone: "kingdra-epoch_mega",
    megaEvolves: "kingdra",
    itemUser: ["kingdra"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10169: 760,
    gen: 6,
    isNonstandard: "Past"
}
