{
    name: "Epoch chandelurite",
    spritenum: 620,
    megaStone: { "Chandelure-Epoch": "Chandelure-mega_epoch"},
    itemUser: ["Chandelure-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10089,
    gen: 6,
    isNonstandard: "Past"
}
