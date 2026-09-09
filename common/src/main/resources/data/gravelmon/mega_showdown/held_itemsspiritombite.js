{
    name: "Spiritombite",
    spritenum: 620,
    megaStone: "spiritomb-mega",
    megaEvolves: "spiritomb",
    itemUser: ["spiritomb"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10076: 760,
    gen: 6,
    isNonstandard: "Past"
}
