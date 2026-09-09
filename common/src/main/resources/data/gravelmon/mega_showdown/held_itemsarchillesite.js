{
    name: "Archillesite",
    spritenum: 620,
    megaStone: "archilles-mega",
    megaEvolves: "archilles",
    itemUser: ["archilles"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10167: 760,
    gen: 6,
    isNonstandard: "Past"
}
