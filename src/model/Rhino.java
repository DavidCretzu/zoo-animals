package model;

public class Rhino extends Mammal {
    public Rhino(){
        this.setDiet("Herbivore");
        this.setPeriodOfGestation(16);
        this.setName("Rhino");
        this.setNumberOfMembers(4);
    }

    public Rhino(String diet , String name , int numberOfMembers , int periodOfGestation){
        this.setDiet(diet);
        this.setName(name);
        this.setNumberOfMembers(numberOfMembers);
        this.setPeriodOfGestation(periodOfGestation);
    }
}
