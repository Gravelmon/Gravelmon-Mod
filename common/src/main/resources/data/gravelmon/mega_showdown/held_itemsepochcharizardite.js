{
    name: "Epochcharizardite",
    spritenum: 620,
    megaStone: "charizard-epoch_mega",
    megaEvolves: "charizard",
    itemUser: ["charizard"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10045: 760,
    gen: 6,
    isNonstandard: "Past"
}
