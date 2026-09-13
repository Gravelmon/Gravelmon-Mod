{
    name: "Delta lopunnyite",
    spritenum: 620,
    megaStone: { "Lopunny-Delta": "Lopunny-mega_delta"},
    itemUser: ["Lopunny-Delta"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10014,
    gen: 6,
    isNonstandard: "Past"
}
