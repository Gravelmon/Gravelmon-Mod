{
    name: "Nuclear gyaradosite",
    spritenum: 620,
    megaStone: { "Gyarados-Nuclear": "Gyarados-mega_nuclear"},
    itemUser: ["Gyarados-Nuclear"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10009,
    gen: 6,
    isNonstandard: "Past"
}
