{
    name: "Lavenrinanite",
    spritenum: 620,
    megaStone: "lavenrina-mega",
    megaEvolves: "lavenrina",
    itemUser: ["lavenrina"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10130: 760,
    gen: 6,
    isNonstandard: "Past"
}
