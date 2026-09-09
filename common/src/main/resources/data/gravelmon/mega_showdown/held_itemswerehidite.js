{
    name: "Werehidite",
    spritenum: 620,
    megaStone: "werehide-mega",
    megaEvolves: "werehide",
    itemUser: ["werehide"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10079: 760,
    gen: 6,
    isNonstandard: "Past"
}
