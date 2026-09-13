{
    name: "Epoch gyaradosite",
    spritenum: 620,
    megaStone: { "Gyarados-Epoch": "Gyarados-mega_epoch"},
    itemUser: ["Gyarados-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10008,
    gen: 6,
    isNonstandard: "Past"
}
