{
    name: "Poliwrathite",
    spritenum: 620,
    megaStone: "poliwrath-mega",
    megaEvolves: "poliwrath",
    itemUser: ["poliwrath"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10025: 760,
    gen: 6,
    isNonstandard: "Past"
}
