{
    name: "Epoch blastoisite",
    spritenum: 620,
    megaStone: { "Blastoise-Epoch": "Blastoise-mega_epoch"},
    itemUser: ["Blastoise-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10137,
    gen: 6,
    isNonstandard: "Past"
}
