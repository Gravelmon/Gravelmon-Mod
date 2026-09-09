{
    name: "Ayreianfearowite",
    spritenum: 620,
    megaStone: "fearow-ayreian_mega",
    megaEvolves: "fearow",
    itemUser: ["fearow"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== ayreian)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10120: 760,
    gen: 6,
    isNonstandard: "Past"
}
