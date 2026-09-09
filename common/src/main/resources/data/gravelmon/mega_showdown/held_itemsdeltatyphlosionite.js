{
    name: "Deltatyphlosionite",
    spritenum: 620,
    megaStone: "typhlosion-delta_active_mega",
    megaEvolves: "typhlosion",
    itemUser: ["typhlosion"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== delta active)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10074: 760,
    gen: 6,
    isNonstandard: "Past"
}
