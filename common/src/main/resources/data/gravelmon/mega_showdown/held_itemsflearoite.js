{
    name: "Flearoite",
    spritenum: 620,
    megaStone: "flearoe-mega",
    megaEvolves: "flearoe",
    itemUser: ["flearoe"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10186: 760,
    gen: 6,
    isNonstandard: "Past"
}
