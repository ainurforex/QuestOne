package ru.ainurforex.QuestOne.model.map;

import ru.ainurforex.QuestOne.model.map.types.UnitType;

import static ru.ainurforex.QuestOne.model.map.types.UnitType.*;

public class Unit {
    private String name;
    private UnitType unitType;

    public Unit(String name, UnitType unitType) {
        this.name = name;
        this.unitType = unitType;
    }

    public Unit() {
        this.name = "none";
        this.unitType = NONEUNIT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    public void setUnitType(UnitType unitType) {
        this.unitType = unitType;
    }
}
