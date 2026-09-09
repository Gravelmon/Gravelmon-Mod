{
    name: "Regalientite",
    spritenum: 620,
    megaStone: "regalient-mega",
    megaEvolves: "regalient",
    itemUser: ["regalient"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10106: 760,
    gen: 6,
    isNonstandard: "Past"
}
