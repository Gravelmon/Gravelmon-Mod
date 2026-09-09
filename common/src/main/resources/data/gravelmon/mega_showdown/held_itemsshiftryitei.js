{
    name: "Shiftryitei",
    spritenum: 620,
    megaStone: "shiftry-mega_i",
    megaEvolves: "shiftry",
    itemUser: ["shiftry"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10090: 760,
    gen: 6,
    isNonstandard: "Past"
}
