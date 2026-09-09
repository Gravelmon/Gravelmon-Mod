{
    name: "Steelixitefire",
    spritenum: 620,
    megaStone: "steelix-mega_fire",
    megaEvolves: "steelix",
    itemUser: ["steelix"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10165: 760,
    gen: 6,
    isNonstandard: "Past"
}
