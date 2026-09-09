{
    name: "Epochemolganite",
    spritenum: 620,
    megaStone: "emolga-epoch_mega",
    megaEvolves: "emolga",
    itemUser: ["emolga"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10085: 760,
    gen: 6,
    isNonstandard: "Past"
}
