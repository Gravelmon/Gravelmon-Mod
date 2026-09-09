{
    name: "Epochtwomasquerainite",
    spritenum: 620,
    megaStone: "masquerain-epochtwo_mega",
    megaEvolves: "masquerain",
    itemUser: ["masquerain"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epochtwo)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10247: 760,
    gen: 6,
    isNonstandard: "Past"
}
