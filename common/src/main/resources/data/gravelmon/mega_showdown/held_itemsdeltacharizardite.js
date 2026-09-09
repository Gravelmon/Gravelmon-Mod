{
    name: "Deltacharizardite",
    spritenum: 620,
    megaStone: "charizard-delta_mega",
    megaEvolves: "charizard",
    itemUser: ["charizard"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== delta)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10043: 760,
    gen: 6,
    isNonstandard: "Past"
}
