{
    name: "Hydromedaryite",
    spritenum: 620,
    megaStone: "hydromedary-mega",
    megaEvolves: "hydromedary",
    itemUser: ["hydromedary"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10026: 760,
    gen: 6,
    isNonstandard: "Past"
}
