{
    name: "Drilgannite",
    spritenum: 620,
    megaStone: { "Drilgann": "Drilgann-mega"},
    itemUser: ["Drilgann"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10001,
    gen: 6,
    isNonstandard: "Past"
}
