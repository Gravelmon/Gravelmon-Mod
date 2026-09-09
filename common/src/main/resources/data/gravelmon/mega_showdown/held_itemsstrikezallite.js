{
    name: "Strikezallite",
    spritenum: 620,
    megaStone: "strikezall-mega",
    megaEvolves: "strikezall",
    itemUser: ["strikezall"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10078: 760,
    gen: 6,
    isNonstandard: "Past"
}
