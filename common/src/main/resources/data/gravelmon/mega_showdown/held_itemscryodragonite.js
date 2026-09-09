{
    name: "Cryodragonite",
    spritenum: 620,
    megaStone: "cryodrago-mega",
    megaEvolves: "cryodrago",
    itemUser: ["cryodrago"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10215: 760,
    gen: 6,
    isNonstandard: "Past"
}
