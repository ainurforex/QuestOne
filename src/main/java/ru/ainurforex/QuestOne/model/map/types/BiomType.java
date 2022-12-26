package ru.ainurforex.QuestOne.model.map.types;

public enum BiomType {
    NONE(0),
    PLAIN(1),
    ROCK(3),
    HILL(4),
    DESERT(5),
    TUNDRA(6),
    SWAMP(7),
    FOREST(8),
    LAKE(9),
    RIVER(10),
    SEA(11);




private final int biomTypeCode;
    BiomType(int biomTypeCode) {
        this.biomTypeCode = biomTypeCode;
    }


}