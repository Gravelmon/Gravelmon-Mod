{
    name: "Ayreianaltarianite",
    spritenum: 620,
    megaStone: "altaria-ayreian_mega",
    megaEvolves: "altaria",
    itemUser: ["altaria"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== ayreian)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10016: 760,
    gen: 6,
    isNonstandard: "Past"
}
