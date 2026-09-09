{
    name: "Epochaltarianite",
    spritenum: 620,
    megaStone: "altaria-epoch_mega",
    megaEvolves: "altaria",
    itemUser: ["altaria"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10017: 760,
    gen: 6,
    isNonstandard: "Past"
}
