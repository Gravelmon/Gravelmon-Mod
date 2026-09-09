{
    name: "Hydreigonite",
    spritenum: 620,
    megaStone: "hydreigon-mega",
    megaEvolves: "hydreigon",
    itemUser: ["hydreigon"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10010: 760,
    gen: 6,
    isNonstandard: "Past"
}
