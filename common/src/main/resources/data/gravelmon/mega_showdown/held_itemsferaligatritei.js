{
    name: "Feraligatritei",
    spritenum: 620,
    megaStone: "feraligatr-mega_i",
    megaEvolves: "feraligatr",
    itemUser: ["feraligatr"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10082: 760,
    gen: 6,
    isNonstandard: "Past"
}
