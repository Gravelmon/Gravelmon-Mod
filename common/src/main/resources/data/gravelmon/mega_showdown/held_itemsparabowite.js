{
    name: "Parabowite",
    spritenum: 620,
    megaStone: "parabow-mega",
    megaEvolves: "parabow",
    itemUser: ["parabow"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10183: 760,
    gen: 6,
    isNonstandard: "Past"
}
