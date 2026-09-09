{
    name: "Armirangarchompite",
    spritenum: 620,
    megaStone: "garchomp-armiran_mega",
    megaEvolves: "garchomp",
    itemUser: ["garchomp"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== armiran)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10146: 760,
    gen: 6,
    isNonstandard: "Past"
}
