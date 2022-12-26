package ru.ainurforex.QuestOne.service;

import ru.ainurforex.QuestOne.model.map.Biom;
import ru.ainurforex.QuestOne.model.map.World;

import java.util.Arrays;

import static ru.ainurforex.QuestOne.model.map.types.BiomType.SEA;

public class MapConstructor {

    public static World fillBiomsBySeed(String seed) {
        short mapSize=10;

        System.out.println(seed.hashCode());
        World world=new World();
        return world;
    }

    public static World fillBiomsTest() {
        byte mapSize=50;//10 2 значное
        byte numberBioms=9;//9 1 значное
        byte shiftXBiom=10;
        byte shiftYBiom=10;
        byte buildBiom=10;
        byte numberRacesControlCentre=9;//будем swich комбинации делать
        byte buildRaceControlCentre=10;

        World world=new World("seed","Test World","Test param",mapSize,mapSize);
        Biom[][] dataBioms=new Biom[mapSize][mapSize];
        fillSea(dataBioms);
        world.setDataBioms(dataBioms);

        return world;
    }

        private static void fillSea(Biom[][]dataBioms) {

            for (int y = 0; y <dataBioms.length ; y++) {
                for (int x = 0; x <dataBioms[0].length ; x++) {
                    Biom biom=new Biom();
                    biom.setBiomType(SEA);
                    dataBioms[y][x]=biom;

                }
            }

        }
}
