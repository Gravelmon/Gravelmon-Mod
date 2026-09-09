{
    name: "Deltablastoisite",
    spritenum: 620,
    megaStone: "blastoise-delta_mega",
    megaEvolves: "blastoise",
    itemUser: ["blastoise"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== delta)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10135: 760,
    gen: 6,
    isNonstandard: "Past"
}
