{
    name: "Syrentidite",
    spritenum: 620,
    megaStone: "syrentide-mega",
    megaEvolves: "syrentide",
    itemUser: ["syrentide"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10149: 760,
    gen: 6,
    isNonstandard: "Past"
}
