{
    name: "Milotited",
    spritenum: 620,
    megaStone: "milotic-mega_d",
    megaEvolves: "milotic",
    itemUser: ["milotic"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10180: 760,
    gen: 6,
    isNonstandard: "Past"
}
