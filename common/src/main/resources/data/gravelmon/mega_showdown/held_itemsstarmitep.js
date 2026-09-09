{
    name: "Starmitep",
    spritenum: 620,
    megaStone: "starmie-mega_p",
    megaEvolves: "starmie",
    itemUser: ["starmie"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10047: 760,
    gen: 6,
    isNonstandard: "Past"
}
