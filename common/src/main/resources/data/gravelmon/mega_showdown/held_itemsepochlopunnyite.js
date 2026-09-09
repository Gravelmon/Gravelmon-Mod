{
    name: "Epochlopunnyite",
    spritenum: 620,
    megaStone: "lopunny-epoch_mega",
    megaEvolves: "lopunny",
    itemUser: ["lopunny"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10015: 760,
    gen: 6,
    isNonstandard: "Past"
}
