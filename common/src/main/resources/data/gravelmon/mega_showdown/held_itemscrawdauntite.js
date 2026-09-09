{
    name: "Crawdauntite",
    spritenum: 620,
    megaStone: "crawdaunt-mega",
    megaEvolves: "crawdaunt",
    itemUser: ["crawdaunt"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10163: 760,
    gen: 6,
    isNonstandard: "Past"
}
