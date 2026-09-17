{
    name: "Epoch grapploctite",
    spritenum: 620,
    megaStone: { "Grapploct-Epoch": "Grapploct-mega_epoch"},
    itemUser: ["Grapploct-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10149,
    gen: 6,
    isNonstandard: "Past"
}
