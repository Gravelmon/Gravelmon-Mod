{
    name: "Epoch garganaclite",
    spritenum: 620,
    megaStone: { "Garganacl-Epoch": "Garganacl-mega_epoch"},
    itemUser: ["Garganacl-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10206,
    gen: 6,
    isNonstandard: "Past"
}
