{
    name: "Epochfurretite",
    spritenum: 620,
    megaStone: "furret-epoch_mega",
    megaEvolves: "furret",
    itemUser: ["furret"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10081: 760,
    gen: 6,
    isNonstandard: "Past"
}
