package ru.ainurforex.QuestOne.model.map.types;

public enum BiomType {
    NONEBIOM(0),
    SEA(1),
    PLAIN(2),
    ROCK(3),
    HILL(4),
    DESERT(5),
    TUNDRA(6),
    SWAMP(7),
    FOREST(8),
    LAKE(9),
    RIVER(10);





private final int biomTypeCode;
    BiomType(int biomTypeCode) {
        this.biomTypeCode = biomTypeCode;
    }
    public int getBiomTypeCode() {
        return this.biomTypeCode;
    }


}