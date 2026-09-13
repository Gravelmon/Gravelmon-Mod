{
    name: "Starmite p",
    spritenum: 620,
    megaStone: { "Starmie": "Starmie-mega_p"},
    itemUser: ["Starmie"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10047,
    gen: 6,
    isNonstandard: "Past"
}
