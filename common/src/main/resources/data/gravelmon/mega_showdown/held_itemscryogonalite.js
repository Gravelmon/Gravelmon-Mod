{
    name: "Cryogonalite",
    spritenum: 620,
    megaStone: "cryogonal-mega",
    megaEvolves: "cryogonal",
    itemUser: ["cryogonal"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10038: 760,
    gen: 6,
    isNonstandard: "Past"
}
