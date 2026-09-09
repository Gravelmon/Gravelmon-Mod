{
    name: "Epochgigalithite",
    spritenum: 620,
    megaStone: "gigalith-epoch_mega",
    megaEvolves: "gigalith",
    itemUser: ["gigalith"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10104: 760,
    gen: 6,
    isNonstandard: "Past"
}
