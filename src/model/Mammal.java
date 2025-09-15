package model;

public class Mammal extends Animal {
    private int periodOfGestation;
    private String diet;

    public int getPeriodOfGestation() {
        return periodOfGestation;
    }

    public String getDiet() {
            return diet;
    }

    public void setPeriodOfGestation(int periodOfGestation) {
        this.periodOfGestation = periodOfGestation;
    }
    public void setDiet(String diet){
        this.diet = diet;
    }



}
