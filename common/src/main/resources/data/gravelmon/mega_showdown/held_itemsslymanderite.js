{
    name: "Slymanderite",
    spritenum: 620,
    megaStone: "slymander-mega",
    megaEvolves: "slymander",
    itemUser: ["slymander"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10211: 760,
    gen: 6,
    isNonstandard: "Past"
}
