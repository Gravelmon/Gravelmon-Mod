{
    name: "Zebstrikanite",
    spritenum: 620,
    megaStone: "zebstrika-mega",
    megaEvolves: "zebstrika",
    itemUser: ["zebstrika"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10064: 760,
    gen: 6,
    isNonstandard: "Past"
}
