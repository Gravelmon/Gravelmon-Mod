{
    name: "Maidnitite",
    spritenum: 620,
    megaStone: "maidnite-mega",
    megaEvolves: "maidnite",
    itemUser: ["maidnite"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10188: 760,
    gen: 6,
    isNonstandard: "Past"
}
