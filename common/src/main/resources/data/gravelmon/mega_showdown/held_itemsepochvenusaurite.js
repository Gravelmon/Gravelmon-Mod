{
    name: "Epochvenusaurite",
    spritenum: 620,
    megaStone: "venusaur-epoch_mega",
    megaEvolves: "venusaur",
    itemUser: ["venusaur"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10237: 760,
    gen: 6,
    isNonstandard: "Past"
}
