{
    name: "Ayreianvenusaurite",
    spritenum: 620,
    megaStone: "venusaur-ayreian_mega",
    megaEvolves: "venusaur",
    itemUser: ["venusaur"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== ayreian)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10236: 760,
    gen: 6,
    isNonstandard: "Past"
}
