{
    name: "Delta pidgeotite",
    spritenum: 620,
    megaStone: { "Pidgeot-Delta": "Pidgeot-mega_delta"},
    itemUser: ["Pidgeot-Delta"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10124,
    gen: 6,
    isNonstandard: "Past"
}
