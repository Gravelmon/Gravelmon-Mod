{
    name: "Helioliskite",
    spritenum: 620,
    megaStone: "heliolisk-mega",
    megaEvolves: "heliolisk",
    itemUser: ["heliolisk"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10118: 760,
    gen: 6,
    isNonstandard: "Past"
}
