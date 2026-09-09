{
    name: "Salaslamite",
    spritenum: 620,
    megaStone: "salaslam-mega",
    megaEvolves: "salaslam",
    itemUser: ["salaslam"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10019: 760,
    gen: 6,
    isNonstandard: "Past"
}
