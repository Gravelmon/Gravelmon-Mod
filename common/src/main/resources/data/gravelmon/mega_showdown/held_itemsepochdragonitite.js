{
    name: "Epochdragonitite",
    spritenum: 620,
    megaStone: "dragonite-epoch_mega",
    megaEvolves: "dragonite",
    itemUser: ["dragonite"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10252: 760,
    gen: 6,
    isNonstandard: "Past"
}
