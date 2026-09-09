{
    name: "Haxorusite",
    spritenum: 620,
    megaStone: "haxorus-mega",
    megaEvolves: "haxorus",
    itemUser: ["haxorus"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10172: 760,
    gen: 6,
    isNonstandard: "Past"
}
