{
    name: "Froslassitei",
    spritenum: 620,
    megaStone: "froslass-mega_i",
    megaEvolves: "froslass",
    itemUser: ["froslass"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10060: 760,
    gen: 6,
    isNonstandard: "Past"
}
