{
    name: "Ayreianrelicanthite",
    spritenum: 620,
    megaStone: "relicanth-ayreian_mega",
    megaEvolves: "relicanth",
    itemUser: ["relicanth"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== ayreian)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10192: 760,
    gen: 6,
    isNonstandard: "Past"
}
