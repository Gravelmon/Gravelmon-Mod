{
    name: "Mountrite",
    spritenum: 620,
    megaStone: "mountree-mega",
    megaEvolves: "mountree",
    itemUser: ["mountree"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10173: 760,
    gen: 6,
    isNonstandard: "Past"
}
