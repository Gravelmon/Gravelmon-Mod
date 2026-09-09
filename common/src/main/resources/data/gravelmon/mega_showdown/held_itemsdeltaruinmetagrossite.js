{
    name: "Deltaruinmetagrossite",
    spritenum: 620,
    megaStone: "metagross-delta_ruin_mega",
    megaEvolves: "metagross",
    itemUser: ["metagross"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== delta ruin)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10243: 760,
    gen: 6,
    isNonstandard: "Past"
}
