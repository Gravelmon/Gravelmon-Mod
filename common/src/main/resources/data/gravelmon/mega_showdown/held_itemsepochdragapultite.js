{
    name: "Epochdragapultite",
    spritenum: 620,
    megaStone: "dragapult-epoch_mega",
    megaEvolves: "dragapult",
    itemUser: ["dragapult"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10145: 760,
    gen: 6,
    isNonstandard: "Past"
}
