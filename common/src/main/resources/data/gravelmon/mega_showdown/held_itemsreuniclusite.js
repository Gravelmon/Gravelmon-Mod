{
    name: "Reuniclusite",
    spritenum: 620,
    megaStone: "reuniclus-mega",
    megaEvolves: "reuniclus",
    itemUser: ["reuniclus"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10156: 760,
    gen: 6,
    isNonstandard: "Past"
}
