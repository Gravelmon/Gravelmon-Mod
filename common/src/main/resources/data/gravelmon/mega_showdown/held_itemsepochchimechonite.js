{
    name: "Epochchimechonite",
    spritenum: 620,
    megaStone: "chimecho-epoch_mega",
    megaEvolves: "chimecho",
    itemUser: ["chimecho"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10160: 760,
    gen: 6,
    isNonstandard: "Past"
}
