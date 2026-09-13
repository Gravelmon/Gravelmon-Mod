{
    name: "Delta scizorite",
    spritenum: 620,
    megaStone: { "Scizor-Delta": "Scizor-mega_delta"},
    itemUser: ["Scizor-Delta"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10116,
    gen: 6,
    isNonstandard: "Past"
}
