{
    name: "Epochtyranitarite",
    spritenum: 620,
    megaStone: "tyranitar-epoch_mega",
    megaEvolves: "tyranitar",
    itemUser: ["tyranitar"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10209: 760,
    gen: 6,
    isNonstandard: "Past"
}
