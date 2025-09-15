package model;

public class SeaBass  extends Fish{
    public SeaBass(){
        this.setName("Seabass");
        this.setMonthOfSpawn(4);
        this.setPredator(true);
        this.setNumberOfMembers(10);
    }

    public SeaBass(String name , int monthOfSpawn , boolean predator, int numberOfMembers){
        this.setName(name);
        this.setMonthOfSpawn(monthOfSpawn);
        this.setPredator(predator);
        this.setNumberOfMembers(numberOfMembers);
    }

}
