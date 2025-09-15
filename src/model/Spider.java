package model;

public class Spider extends Insect{
    public Spider(){
        this.setName("Spider");
        this.setNocturnal(false);
        this.setWinged(false);
        this.setNumberOfMembers(6);
    }

    public Spider(int numberOfMembers , String name , boolean nocturnal, boolean winged){
        this.setName(name);
        this.setNocturnal(nocturnal);
        this.setWinged(winged);
        this.setNumberOfMembers(numberOfMembers);
    }
}
