{
    name: "Suicunite",
    spritenum: 620,
    megaStone: "suicune-mega",
    megaEvolves: "suicune",
    itemUser: ["suicune"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10198: 760,
    gen: 6,
    isNonstandard: "Past"
}
