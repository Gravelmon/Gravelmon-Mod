{
    name: "Electruxonite",
    spritenum: 620,
    megaStone: "electruxo-mega",
    megaEvolves: "electruxo",
    itemUser: ["electruxo"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10123: 760,
    gen: 6,
    isNonstandard: "Past"
}
