{
    name: "Epoch lopunnyite",
    spritenum: 620,
    megaStone: { "Lopunny-Epoch": "Lopunny-mega_epoch"},
    itemUser: ["Lopunny-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10015,
    gen: 6,
    isNonstandard: "Past"
}
