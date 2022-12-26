package ru.ainurforex.QuestOne.model.map;

public class World {
    private String seed;
    private String name;
    private String discription;
    private short xMapLenght;
    private short yMapLenght;
    private Biom[][] dataBioms;

    public World(String seed,  String name, String discription, short xMapLenght, short yMapLenght) {
        this.seed = seed;
        this.name = name;
        this.discription = discription;
        this.xMapLenght = xMapLenght;
        this.yMapLenght = yMapLenght;
        this.dataBioms =new Biom[xMapLenght][yMapLenght];
    }

    public World() {
        this.seed = "seed";
        this.name = "World";
        this.discription = "Deafult World";
        this.xMapLenght = 10;
        this.yMapLenght = 10;
        this.dataBioms =new Biom[xMapLenght][yMapLenght];
    }

    public String getSeed() {
        return seed;
    }

    public void setSeed(String seed) {
        this.seed = seed;
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

    public short getxMapLenght() {
        return xMapLenght;
    }

    public void setxMapLenght(short xMapLenght) {
        this.xMapLenght = xMapLenght;
    }

    public short getyMapLenght() {
        return yMapLenght;
    }

    public void setyMapLenght(short yMapLenght) {
        this.yMapLenght = yMapLenght;
    }

    public Biom[][] getDataBioms() {
        return dataBioms;
    }

    public void setDataBioms(Biom[][] dataBioms) {
        this.dataBioms = dataBioms;
        this.xMapLenght= (short) dataBioms.length;
        this.yMapLenght= (short) dataBioms[0].length;
    }
}
