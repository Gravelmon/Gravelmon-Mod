{
    name: "Epochgarganaclite",
    spritenum: 620,
    megaStone: "garganacl-epoch_mega",
    megaEvolves: "garganacl",
    itemUser: ["garganacl"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10206: 760,
    gen: 6,
    isNonstandard: "Past"
}
