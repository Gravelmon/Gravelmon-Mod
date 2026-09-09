{
    name: "Deltavenusaurite",
    spritenum: 620,
    megaStone: "venusaur-delta_mega",
    megaEvolves: "venusaur",
    itemUser: ["venusaur"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== delta)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10235: 760,
    gen: 6,
    isNonstandard: "Past"
}
