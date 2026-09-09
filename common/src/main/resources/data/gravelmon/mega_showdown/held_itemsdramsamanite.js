{
    name: "Dramsamanite",
    spritenum: 620,
    megaStone: "dramsama-mega",
    megaEvolves: "dramsama",
    itemUser: ["dramsama"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10094: 760,
    gen: 6,
    isNonstandard: "Past"
}
