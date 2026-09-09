{
    name: "Epochgolurkite",
    spritenum: 620,
    megaStone: "golurk-epoch_mega",
    megaEvolves: "golurk",
    itemUser: ["golurk"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10067: 760,
    gen: 6,
    isNonstandard: "Past"
}
