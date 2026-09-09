{
    name: "Epochblazikenite",
    spritenum: 620,
    megaStone: "blaziken-epoch_mega",
    megaEvolves: "blaziken",
    itemUser: ["blaziken"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10005: 760,
    gen: 6,
    isNonstandard: "Past"
}
