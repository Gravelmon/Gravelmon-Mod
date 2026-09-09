{
    name: "Epochsalamencite",
    spritenum: 620,
    megaStone: "salamence-epoch_mega",
    megaEvolves: "salamence",
    itemUser: ["salamence"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10213: 760,
    gen: 6,
    isNonstandard: "Past"
}
