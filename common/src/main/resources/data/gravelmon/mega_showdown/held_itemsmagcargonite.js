{
    name: "Magcargonite",
    spritenum: 620,
    megaStone: "magcargo-mega",
    megaEvolves: "magcargo",
    itemUser: ["magcargo"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10220: 760,
    gen: 6,
    isNonstandard: "Past"
}
