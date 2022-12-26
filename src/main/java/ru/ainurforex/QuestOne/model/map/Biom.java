/**
 * Area 10x10 km
 */

package ru.ainurforex.QuestOne.model.map;

import ru.ainurforex.QuestOne.model.map.types.BiomType;

import static ru.ainurforex.QuestOne.model.map.types.BiomType.*;

public class Biom {

    private final byte xAreaLenght=10;
    private final byte yAreaLenght=10;
    private String name;
    private String discription;
    private BiomType biomType;
    private Location[][] locationsType;

    public Biom(String name, String discription, BiomType biomType) {
        this.name = name;
        this.discription = discription;
        this.biomType = biomType;
        this.locationsType =new Location[xAreaLenght][yAreaLenght];
    }

    public Biom() {
        this.name = "none";
        this.discription = "none";
        this.biomType = NONE;

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

    public BiomType getBiomType() {
        return biomType;
    }

    public void setBiomType(BiomType biomType) {
        this.biomType = biomType;
    }


    public Location[][] getLocationsType() {
        return locationsType;
    }

    public void setLocationsType(Location[][] locationsType) {
        this.locationsType = locationsType;

    }
}
