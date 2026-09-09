{
    name: "Ayreianblastoisite",
    spritenum: 620,
    megaStone: "blastoise-ayreian_mega",
    megaEvolves: "blastoise",
    itemUser: ["blastoise"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== ayreian)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10136: 760,
    gen: 6,
    isNonstandard: "Past"
}
