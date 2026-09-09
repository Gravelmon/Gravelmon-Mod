{
    name: "Epochgardevoirite",
    spritenum: 620,
    megaStone: "gardevoir-epoch_mega",
    megaEvolves: "gardevoir",
    itemUser: ["gardevoir"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10103: 760,
    gen: 6,
    isNonstandard: "Past"
}
