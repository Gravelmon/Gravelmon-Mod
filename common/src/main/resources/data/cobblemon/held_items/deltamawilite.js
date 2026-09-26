{
    name: "Delta mawilite",
    spritenum: 620,
    megaStone: { "Mawile-Delta": "Mawile-mega_delta"},
    itemUser: ["Mawile-Delta"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10118,
    gen: 6,
    isNonstandard: "Past"
}
