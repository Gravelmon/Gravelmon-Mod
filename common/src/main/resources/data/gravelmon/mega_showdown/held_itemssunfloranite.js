{
    name: "Sunfloranite",
    spritenum: 620,
    megaStone: "sunflora-mega",
    megaEvolves: "sunflora",
    itemUser: ["sunflora"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10190: 760,
    gen: 6,
    isNonstandard: "Past"
}
