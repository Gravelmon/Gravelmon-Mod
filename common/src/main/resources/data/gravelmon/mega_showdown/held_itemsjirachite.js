{
    name: "Jirachite",
    spritenum: 620,
    megaStone: "jirachi-mega",
    megaEvolves: "jirachi",
    itemUser: ["jirachi"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10112: 760,
    gen: 6,
    isNonstandard: "Past"
}
