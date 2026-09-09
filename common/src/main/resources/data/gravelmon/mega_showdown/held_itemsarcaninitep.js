{
    name: "Arcaninitep",
    spritenum: 620,
    megaStone: "arcanine-mega_p",
    megaEvolves: "arcanine",
    itemUser: ["arcanine"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10121: 760,
    gen: 6,
    isNonstandard: "Past"
}
