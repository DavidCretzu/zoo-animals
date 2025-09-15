package model;

public class Fish extends Animal{
    private boolean predator;
    private int monthOfSpawn;

    public int getMonthOfSpawn () {
        return monthOfSpawn;
    }
    public boolean getPredator () {
        return predator;
    }
    public void setPredator (boolean predator) {
        this.predator = predator;
    }
    public void setMonthOfSpawn (int monthOfSpawn) {
        this.monthOfSpawn = monthOfSpawn;
    }
}
