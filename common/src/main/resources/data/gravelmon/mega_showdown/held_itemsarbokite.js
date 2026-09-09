{
    name: "Arbokite",
    spritenum: 620,
    megaStone: "arbok-mega",
    megaEvolves: "arbok",
    itemUser: ["arbok"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10053: 760,
    gen: 6,
    isNonstandard: "Past"
}
