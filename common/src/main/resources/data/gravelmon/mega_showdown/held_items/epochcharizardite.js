{
    name: "Epoch charizardite",
    spritenum: 620,
    megaStone: { "Charizard-Epoch": "Charizard-mega_epoch"},
    itemUser: ["Charizard-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10045,
    gen: 6,
    isNonstandard: "Past"
}
