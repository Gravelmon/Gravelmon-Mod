{
    name: "Stunfiskite",
    spritenum: 620,
    megaStone: "stunfisk-mega",
    megaEvolves: "stunfisk",
    itemUser: ["stunfisk"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10034: 760,
    gen: 6,
    isNonstandard: "Past"
}
