{
    name: "Inflagetahite",
    spritenum: 620,
    megaStone: "inflagetah-mega",
    megaEvolves: "inflagetah",
    itemUser: ["inflagetah"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10189: 760,
    gen: 6,
    isNonstandard: "Past"
}
