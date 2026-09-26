{
    name: "Ayreian relicanthite",
    spritenum: 620,
    megaStone: { "Relicanth-Ayreian": "Relicanth-mega_ayreian"},
    itemUser: ["Relicanth-Ayreian"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10190,
    gen: 6,
    isNonstandard: "Past"
}
