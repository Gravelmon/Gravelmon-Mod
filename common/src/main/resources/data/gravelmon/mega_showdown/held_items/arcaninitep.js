{
    name: "Arcaninite p",
    spritenum: 620,
    megaStone: { "Arcanine": "Arcanine-mega_p"},
    itemUser: ["Arcanine"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10121,
    gen: 6,
    isNonstandard: "Past"
}
