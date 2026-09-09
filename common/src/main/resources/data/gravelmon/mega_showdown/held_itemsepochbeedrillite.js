{
    name: "Epochbeedrillite",
    spritenum: 620,
    megaStone: "beedrill-epoch_mega",
    megaEvolves: "beedrill",
    itemUser: ["beedrill"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10002: 760,
    gen: 6,
    isNonstandard: "Past"
}
