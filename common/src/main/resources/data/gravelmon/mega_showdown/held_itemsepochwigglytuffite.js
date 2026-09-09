{
    name: "Epochwigglytuffite",
    spritenum: 620,
    megaStone: "wigglytuff-epoch_mega",
    megaEvolves: "wigglytuff",
    itemUser: ["wigglytuff"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10041: 760,
    gen: 6,
    isNonstandard: "Past"
}
