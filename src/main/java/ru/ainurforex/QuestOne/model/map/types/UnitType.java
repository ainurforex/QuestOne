package ru.ainurforex.QuestOne.model.map.types;

public enum UnitType {
    NONEUNIT(0),
    TOWER(1),
    SHOP(2),
    GATES(3),
    HOUSE(4),
    SEWER(5),
    HOTEL(6),
    SQUARE(7),
    CHURCH(8),
    MILL(9),
    SAWMILL(10),
    WELL(11),
    FONTAIN(12),
    TREE(13),
    STATUE(14),
    STONE(15),
    HAYSTACK(16);
    private final int unitTypeCode;
    UnitType(int unitTypeCode) {
        this.unitTypeCode = unitTypeCode;
    }

}
