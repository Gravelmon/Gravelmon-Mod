{
    name: "Arcaninite x",
    spritenum: 620,
    megaStone: { "Arcanine": "Arcanine-mega_x"},
    itemUser: ["Arcanine"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10122,
    gen: 6,
    isNonstandard: "Past"
}
