{
    name: "Epochmanectrite",
    spritenum: 620,
    megaStone: "manectric-epoch_mega",
    megaEvolves: "manectric",
    itemUser: ["manectric"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10250: 760,
    gen: 6,
    isNonstandard: "Past"
}
