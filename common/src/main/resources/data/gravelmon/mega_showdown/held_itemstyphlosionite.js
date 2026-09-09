{
    name: "Typhlosionite",
    spritenum: 620,
    megaStone: "typhlosion-mega",
    megaEvolves: "typhlosion",
    itemUser: ["typhlosion"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10072: 760,
    gen: 6,
    isNonstandard: "Past"
}
