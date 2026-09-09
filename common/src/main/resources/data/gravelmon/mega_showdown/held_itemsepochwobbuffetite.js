{
    name: "Epochwobbuffetite",
    spritenum: 620,
    megaStone: "wobbuffet-epoch_mega",
    megaEvolves: "wobbuffet",
    itemUser: ["wobbuffet"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10170: 760,
    gen: 6,
    isNonstandard: "Past"
}
