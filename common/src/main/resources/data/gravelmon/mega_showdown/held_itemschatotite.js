{
    name: "Chatotite",
    spritenum: 620,
    megaStone: "chatot-mega",
    megaEvolves: "chatot",
    itemUser: ["chatot"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10241: 760,
    gen: 6,
    isNonstandard: "Past"
}
