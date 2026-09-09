{
    name: "Epochtwocharizardite",
    spritenum: 620,
    megaStone: "charizard-epochtwo_mega",
    megaEvolves: "charizard",
    itemUser: ["charizard"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epochtwo)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10046: 760,
    gen: 6,
    isNonstandard: "Past"
}
