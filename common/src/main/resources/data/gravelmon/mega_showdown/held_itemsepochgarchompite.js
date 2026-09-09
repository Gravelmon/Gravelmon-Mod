{
    name: "Epochgarchompite",
    spritenum: 620,
    megaStone: "garchomp-epoch_mega",
    megaEvolves: "garchomp",
    itemUser: ["garchomp"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10147: 760,
    gen: 6,
    isNonstandard: "Past"
}
