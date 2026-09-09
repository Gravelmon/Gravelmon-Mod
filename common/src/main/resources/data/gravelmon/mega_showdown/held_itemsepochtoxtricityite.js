{
    name: "Epochtoxtricityite",
    spritenum: 620,
    megaStone: "toxtricity-epoch_mega",
    megaEvolves: "toxtricity",
    itemUser: ["toxtricity"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10117: 760,
    gen: 6,
    isNonstandard: "Past"
}
