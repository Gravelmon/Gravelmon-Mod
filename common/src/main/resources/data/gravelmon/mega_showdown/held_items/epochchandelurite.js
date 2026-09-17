{
    name: "Epoch chandelurite",
    spritenum: 620,
    megaStone: { "Chandelure-Epoch": "Chandelure-mega_epoch"},
    itemUser: ["Chandelure-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10088,
    gen: 6,
    isNonstandard: "Past"
}
