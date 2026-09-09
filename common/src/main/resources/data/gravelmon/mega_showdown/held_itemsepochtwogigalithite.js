{
    name: "Epochtwogigalithite",
    spritenum: 620,
    megaStone: "gigalith-epochtwo_mega",
    megaEvolves: "gigalith",
    itemUser: ["gigalith"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epochtwo)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10105: 760,
    gen: 6,
    isNonstandard: "Past"
}
