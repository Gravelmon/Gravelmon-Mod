{
    name: "Epochmamoswinite",
    spritenum: 620,
    megaStone: "mamoswine-epoch_mega",
    megaEvolves: "mamoswine",
    itemUser: ["mamoswine"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10249: 760,
    gen: 6,
    isNonstandard: "Past"
}
