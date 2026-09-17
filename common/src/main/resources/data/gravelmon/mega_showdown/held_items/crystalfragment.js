{
    name: "Crystal fragment",
    spritenum: 620,
    megaStone: { "Metagross-Delta crystal": "Metagross-mega_delta_crystal"},
    itemUser: ["Metagross-Delta crystal"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10241,
    gen: 6,
    isNonstandard: "Past"
}
