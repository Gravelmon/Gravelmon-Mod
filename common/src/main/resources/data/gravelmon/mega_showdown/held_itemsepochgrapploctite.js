{
    name: "Epochgrapploctite",
    spritenum: 620,
    megaStone: "grapploct-epoch_mega",
    megaEvolves: "grapploct",
    itemUser: ["grapploct"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10152: 760,
    gen: 6,
    isNonstandard: "Past"
}
