{
    name: "Epochgarbodorite",
    spritenum: 620,
    megaStone: "garbodor-epoch_mega",
    megaEvolves: "garbodor",
    itemUser: ["garbodor"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10142: 760,
    gen: 6,
    isNonstandard: "Past"
}
