{
    name: "Delta sunfloranite",
    spritenum: 620,
    megaStone: { "Sunflora-Delta": "Sunflora-mega_delta"},
    itemUser: ["Sunflora-Delta"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10189,
    gen: 6,
    isNonstandard: "Past"
}
