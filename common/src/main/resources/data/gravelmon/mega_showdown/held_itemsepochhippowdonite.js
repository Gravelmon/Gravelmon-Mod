{
    name: "Epochhippowdonite",
    spritenum: 620,
    megaStone: "hippowdon-epoch_mega",
    megaEvolves: "hippowdon",
    itemUser: ["hippowdon"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10194: 760,
    gen: 6,
    isNonstandard: "Past"
}
