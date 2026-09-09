{
    name: "Deltaspidermetagrossite",
    spritenum: 620,
    megaStone: "metagross-delta_spider_mega",
    megaEvolves: "metagross",
    itemUser: ["metagross"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== delta spider)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10242: 760,
    gen: 6,
    isNonstandard: "Past"
}
