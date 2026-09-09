{
    name: "Raizodonite",
    spritenum: 620,
    megaStone: "raizodon-mega",
    megaEvolves: "raizodon",
    itemUser: ["raizodon"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10205: 760,
    gen: 6,
    isNonstandard: "Past"
}
