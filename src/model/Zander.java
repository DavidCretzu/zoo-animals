package model;

public class Zander extends Fish {

    public Zander(){
        this.setName("Zander");
        this.setMonthOfSpawn(5);
        this.setPredator(true);
        this.setNumberOfMembers(8);
    }

    public Zander(String name , int monthOfSpawn , boolean predator, int numberOfMembers){
        this.setName(name);
        this.setMonthOfSpawn(monthOfSpawn);
        this.setPredator(predator);
        this.setNumberOfMembers(numberOfMembers);
    }
}
