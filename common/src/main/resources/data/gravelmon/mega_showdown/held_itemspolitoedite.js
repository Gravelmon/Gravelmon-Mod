{
    name: "Politoedite",
    spritenum: 620,
    megaStone: "politoed-mega",
    megaEvolves: "politoed",
    itemUser: ["politoed"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10100: 760,
    gen: 6,
    isNonstandard: "Past"
}
