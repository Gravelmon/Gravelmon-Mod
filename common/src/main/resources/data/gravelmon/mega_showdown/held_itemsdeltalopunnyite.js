{
    name: "Deltalopunnyite",
    spritenum: 620,
    megaStone: "lopunny-delta_mega",
    megaEvolves: "lopunny",
    itemUser: ["lopunny"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== delta)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10014: 760,
    gen: 6,
    isNonstandard: "Past"
}
