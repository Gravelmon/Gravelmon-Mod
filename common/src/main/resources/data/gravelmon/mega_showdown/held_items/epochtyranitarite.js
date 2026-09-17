{
    name: "Epoch tyranitarite",
    spritenum: 620,
    megaStone: { "Tyranitar-Epoch": "Tyranitar-mega_epoch"},
    itemUser: ["Tyranitar-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10206,
    gen: 6,
    isNonstandard: "Past"
}
