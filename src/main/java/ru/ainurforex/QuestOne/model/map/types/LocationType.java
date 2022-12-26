package ru.ainurforex.QuestOne.model.map.types;

public enum LocationType {
    NONE(0),
    BUILDING(1),
    CAMP(2),
    VILAGE(3),
    FORT(4),
    TOWN(5),
    CAPITAL(6),
    CАVE(7),
    DUNGEON(8),
    OBELISK(9),
    TEMPLE(10),
    PORTAL(11),
    ROAD(12),
    GROVE(13),//роща
    MOUND(14),//курган
    MINE(15),
    FIELD(16);

    private final int locationTypeCode;
    LocationType(int locationTypeCode) {
        this.locationTypeCode = locationTypeCode;
    }
}
