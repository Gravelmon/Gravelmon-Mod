{
    name: "Ayreiancharizardite",
    spritenum: 620,
    megaStone: "charizard-ayreian_mega",
    megaEvolves: "charizard",
    itemUser: ["charizard"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== ayreian)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10044: 760,
    gen: 6,
    isNonstandard: "Past"
}
