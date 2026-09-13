{
    name: "Delta sableyite",
    spritenum: 620,
    megaStone: { "Sableye-Delta": "Sableye-mega_delta"},
    itemUser: ["Sableye-Delta"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10086,
    gen: 6,
    isNonstandard: "Past"
}
