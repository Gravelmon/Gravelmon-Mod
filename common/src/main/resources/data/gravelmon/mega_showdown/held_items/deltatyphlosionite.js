{
    name: "Delta typhlosionite",
    spritenum: 620,
    megaStone: { "Typhlosion-Delta active": "Typhlosion-mega_delta_active"},
    itemUser: ["Typhlosion-Delta active"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10074,
    gen: 6,
    isNonstandard: "Past"
}
