{
    name: "Smaquanite",
    spritenum: 620,
    megaStone: "smaqua-mega",
    megaEvolves: "smaqua",
    itemUser: ["smaqua"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10071: 760,
    gen: 6,
    isNonstandard: "Past"
}
