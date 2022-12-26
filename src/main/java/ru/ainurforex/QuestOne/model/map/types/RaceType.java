package ru.ainurforex.QuestOne.model.map.types;

public enum RaceType {
    NONERACE(0),
    HUMAN(1),
    ELF(2),
    DWARF(3),
    ORC(4),
    UNDEAD(5);
    private final int raceTypeCode;
    RaceType(int raceTypeCode) {
        this.raceTypeCode = raceTypeCode;
    }
}
