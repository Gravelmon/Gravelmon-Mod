{
    name: "Epochtwoswampertite",
    spritenum: 620,
    megaStone: "swampert-epochtwo_mega",
    megaEvolves: "swampert",
    itemUser: ["swampert"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epochtwo)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10050: 760,
    gen: 6,
    isNonstandard: "Past"
}
