package model;

public class Tiger extends Mammal {
    public Tiger(){
        this.setDiet("Carnivore");
        this.setPeriodOfGestation(4);
        this.setName("Tiger");
        this.setNumberOfMembers(4);
    }

    public Tiger(String diet , String name , int numberOfMembers , int periodOfGestation){
        this.setDiet(diet);
        this.setName(name);
        this.setNumberOfMembers(numberOfMembers);
        this.setPeriodOfGestation(periodOfGestation);
    }
}
