package ru.ainurforex.QuestOne;

import ru.ainurforex.QuestOne.model.map.Biom;
import ru.ainurforex.QuestOne.model.map.World;
import ru.ainurforex.QuestOne.model.map.types.BiomType;
import ru.ainurforex.QuestOne.service.ConsolDraw;
import ru.ainurforex.QuestOne.service.MapConstructor;

import static ru.ainurforex.QuestOne.model.map.types.BiomType.SEA;

public class Main {
    public static void main(String[] args) {
        World world = MapConstructor.fillBiomsTest();
        Biom[][] dataBioms = world.getDataBioms();

        paintWorld(world);
    }

    private static void paintWorld(World world) {
        Biom[][] dataBioms = world.getDataBioms();
        int yMax=dataBioms.length;
        int xMax=dataBioms[0].length*2;
        ConsolDraw consolDraw=new ConsolDraw(xMax,yMax);
        for (int y = 0; y < dataBioms.length; y++) {
            for (int x = 0; x < dataBioms[0].length; x=x+2) {

                int biomTypeCode=dataBioms[y][x].getBiomType().getBiomTypeCode();
                char raceControl=dataBioms[y][x].getRaceControl().name().charAt(0);
                consolDraw.draw16Color(x,y,biomTypeCode);
                consolDraw.drawChar(x+1,y,raceControl);
            }
        }
        consolDraw.show();
    }
}