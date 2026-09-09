{
    name: "Epochgliscorite",
    spritenum: 620,
    megaStone: "gliscor-epoch_mega",
    megaEvolves: "gliscor",
    itemUser: ["gliscor"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10109: 760,
    gen: 6,
    isNonstandard: "Past"
}
