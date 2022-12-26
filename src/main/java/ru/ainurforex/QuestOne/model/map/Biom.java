/**
 * Area 10x10 km
 */

package ru.ainurforex.QuestOne.model.map;

import ru.ainurforex.QuestOne.model.map.types.BiomType;
import ru.ainurforex.QuestOne.model.map.types.RaceType;

import static ru.ainurforex.QuestOne.model.map.types.BiomType.*;
import static ru.ainurforex.QuestOne.model.map.types.RaceType.*;

public class Biom {

    private final byte xAreaLenght=10;
    private final byte yAreaLenght=10;
    private String name;
    private String discription;
    private BiomType biomType;
    private RaceType raceControl;
    private Location[][] locationsType;



    public Biom(String name, String discription, BiomType biomType,RaceType raceControl) {
        this.name = name;
        this.discription = discription;
        this.biomType = biomType;
        this.raceControl = raceControl;
        this.locationsType =new Location[xAreaLenght][yAreaLenght];
    }

    public Biom() {
        this.name = "none";
        this.discription = "none";
        this.biomType = NONEBIOM;
        this.raceControl = NONERACE;
        this.locationsType =new Location[xAreaLenght][yAreaLenght];

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

    public RaceType getRaceControl() {
        return raceControl;
    }

    public void setRaceControl(RaceType raceControl) {
        this.raceControl = raceControl;
    }

    public Location[][] getLocationsType() {
        return locationsType;
    }

    public void setLocationsType(Location[][] locationsType) {
        this.locationsType = locationsType;

    }
}
