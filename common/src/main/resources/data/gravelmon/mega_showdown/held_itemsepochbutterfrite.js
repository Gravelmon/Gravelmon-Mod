{
    name: "Epochbutterfrite",
    spritenum: 620,
    megaStone: "butterfree-epoch_mega",
    megaEvolves: "butterfree",
    itemUser: ["butterfree"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10133: 760,
    gen: 6,
    isNonstandard: "Past"
}
