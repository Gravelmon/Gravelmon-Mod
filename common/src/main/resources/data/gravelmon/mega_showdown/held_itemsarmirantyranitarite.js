{
    name: "Armirantyranitarite",
    spritenum: 620,
    megaStone: "tyranitar-armiran_mega",
    megaEvolves: "tyranitar",
    itemUser: ["tyranitar"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== armiran)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10208: 760,
    gen: 6,
    isNonstandard: "Past"
}
