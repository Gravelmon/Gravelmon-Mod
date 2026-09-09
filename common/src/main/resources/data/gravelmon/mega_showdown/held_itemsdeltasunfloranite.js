{
    name: "Deltasunfloranite",
    spritenum: 620,
    megaStone: "sunflora-delta_mega",
    megaEvolves: "sunflora",
    itemUser: ["sunflora"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== delta)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10191: 760,
    gen: 6,
    isNonstandard: "Past"
}
