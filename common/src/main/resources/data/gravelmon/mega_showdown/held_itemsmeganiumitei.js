{
    name: "Meganiumitei",
    spritenum: 620,
    megaStone: "meganium-mega_i",
    megaEvolves: "meganium",
    itemUser: ["meganium"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10003: 760,
    gen: 6,
    isNonstandard: "Past"
}
