{
    name: "Epoch ursalunanite",
    spritenum: 620,
    megaStone: { "Ursaluna-Epoch": "Ursaluna-mega_epoch"},
    itemUser: ["Ursaluna-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10157,
    gen: 6,
    isNonstandard: "Past"
}
