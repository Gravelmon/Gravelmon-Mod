{
    name: "Epochcoalossalite",
    spritenum: 620,
    megaStone: "coalossal-epoch_mega",
    megaEvolves: "coalossal",
    itemUser: ["coalossal"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10096: 760,
    gen: 6,
    isNonstandard: "Past"
}
