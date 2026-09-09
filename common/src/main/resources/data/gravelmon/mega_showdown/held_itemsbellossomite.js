{
    name: "Bellossomite",
    spritenum: 620,
    megaStone: "bellossom-mega",
    megaEvolves: "bellossom",
    itemUser: ["bellossom"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10224: 760,
    gen: 6,
    isNonstandard: "Past"
}
