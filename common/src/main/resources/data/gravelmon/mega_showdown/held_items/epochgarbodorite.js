{
    name: "Epoch garbodorite",
    spritenum: 620,
    megaStone: { "Garbodor-Epoch": "Garbodor-mega_epoch"},
    itemUser: ["Garbodor-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10140,
    gen: 6,
    isNonstandard: "Past"
}
