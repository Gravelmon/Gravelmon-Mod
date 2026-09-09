{
    name: "Epochfroslassite",
    spritenum: 620,
    megaStone: "froslass-epoch_mega",
    megaEvolves: "froslass",
    itemUser: ["froslass"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10062: 760,
    gen: 6,
    isNonstandard: "Past"
}
