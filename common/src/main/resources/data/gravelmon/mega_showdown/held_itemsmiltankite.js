{
    name: "Miltankite",
    spritenum: 620,
    megaStone: "miltank-mega",
    megaEvolves: "miltank",
    itemUser: ["miltank"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10058: 760,
    gen: 6,
    isNonstandard: "Past"
}
