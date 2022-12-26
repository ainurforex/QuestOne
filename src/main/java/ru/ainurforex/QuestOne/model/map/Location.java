/**
 * Simple Locations in Biom
 */
package ru.ainurforex.QuestOne.model.map;

import ru.ainurforex.QuestOne.model.map.types.LocationType;

import static ru.ainurforex.QuestOne.model.map.types.LocationType.*;

public class Location {
    private String name;
    private String discription;
    private LocationType locationType;
    private Unit[] units;

    public Location(String name, String discription, LocationType locationType) {
        this.name = name;
        this.discription = discription;
        this.locationType = locationType;
        this.units = new Unit[10];
    }

    public Location() {
        this.name = "none";
        this.discription = "none";
        this.locationType = NONE;
        this.units = new Unit[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public LocationType getLocationType() {
        return locationType;
    }

    public void setLocationType(LocationType locationType) {
        this.locationType = locationType;
    }

    public Unit[] getUnits() {
        return units;
    }

    public void setUnits(Unit[] units) {
        this.units = units;
    }
}
