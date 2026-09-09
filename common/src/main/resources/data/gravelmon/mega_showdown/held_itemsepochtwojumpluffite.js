{
    name: "Epochtwojumpluffite",
    spritenum: 620,
    megaStone: "jumpluff-epochtwo_mega",
    megaEvolves: "jumpluff",
    itemUser: ["jumpluff"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epochtwo)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10239: 760,
    gen: 6,
    isNonstandard: "Past"
}
