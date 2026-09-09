{
    name: "Arcaninitex",
    spritenum: 620,
    megaStone: "arcanine-mega_x",
    megaEvolves: "arcanine",
    itemUser: ["arcanine"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10122: 760,
    gen: 6,
    isNonstandard: "Past"
}
