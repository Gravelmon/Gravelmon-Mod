{
    name: "Laprasite",
    spritenum: 620,
    megaStone: "lapras-mega",
    megaEvolves: "lapras",
    itemUser: ["lapras"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10200: 760,
    gen: 6,
    isNonstandard: "Past"
}
