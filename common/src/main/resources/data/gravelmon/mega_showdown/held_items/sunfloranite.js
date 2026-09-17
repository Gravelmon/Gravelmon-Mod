{
    name: "Sunfloranite",
    spritenum: 620,
    megaStone: { "Sunflora": "Sunflora-mega"},
    itemUser: ["Sunflora"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10187,
    gen: 6,
    isNonstandard: "Past"
}
