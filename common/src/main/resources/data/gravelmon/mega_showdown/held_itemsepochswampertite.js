{
    name: "Epochswampertite",
    spritenum: 620,
    megaStone: "swampert-epoch_mega",
    megaEvolves: "swampert",
    itemUser: ["swampert"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10049: 760,
    gen: 6,
    isNonstandard: "Past"
}
