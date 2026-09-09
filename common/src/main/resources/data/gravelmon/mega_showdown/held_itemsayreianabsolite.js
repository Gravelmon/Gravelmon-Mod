{
    name: "Ayreianabsolite",
    spritenum: 620,
    megaStone: "absol-ayreian_mega",
    megaEvolves: "absol",
    itemUser: ["absol"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== ayreian)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10031: 760,
    gen: 6,
    isNonstandard: "Past"
}
