{
    name: "Epochbarbaraclite",
    spritenum: 620,
    megaStone: "barbaracle-epoch_mega",
    megaEvolves: "barbaracle",
    itemUser: ["barbaracle"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10039: 760,
    gen: 6,
    isNonstandard: "Past"
}
