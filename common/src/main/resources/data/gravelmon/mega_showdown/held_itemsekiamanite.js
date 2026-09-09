{
    name: "Ekiamanite",
    spritenum: 620,
    megaStone: "ekiama-mega",
    megaEvolves: "ekiama",
    itemUser: ["ekiama"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10024: 760,
    gen: 6,
    isNonstandard: "Past"
}
