package model;

public class Pike extends Fish {

    public Pike(){
        this.setName("Pike");
        this.setMonthOfSpawn(3);
        this.setPredator(true);
        this.setNumberOfMembers(7);
    }

    public Pike(String name , int monthOfSpawn , boolean predator, int numberOfMembers){
        this.setName(name);
        this.setMonthOfSpawn(monthOfSpawn);
        this.setPredator(predator);
        this.setNumberOfMembers(numberOfMembers);
    }
}
