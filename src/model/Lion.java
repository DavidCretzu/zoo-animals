package model;

public class Lion extends Mammal{
    public Lion(){
        this.setDiet("Carnivore");
        this.setPeriodOfGestation(3);
        this.setName("Lion");
        this.setNumberOfMembers(4);
    }

    public Lion(String diet , String name , int numberOfMembers , int periodOfGestation){
        this.setDiet(diet);
        this.setName(name);
        this.setNumberOfMembers(numberOfMembers);
        this.setPeriodOfGestation(periodOfGestation);
    }


}
