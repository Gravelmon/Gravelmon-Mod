{
    name: "Epochraichuite",
    spritenum: 620,
    megaStone: "raichu-epoch_mega",
    megaEvolves: "raichu",
    itemUser: ["raichu"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10030: 760,
    gen: 6,
    isNonstandard: "Past"
}
