package model;

public class Butterfly extends Insect {
    public Butterfly(){
        this.setName("Butterfly");
        this.setNocturnal(false);
        this.setWinged(true);
        this.setNumberOfMembers(6);
    }

    public Butterfly(int numberOfMembers , String name , boolean nocturnal, boolean winged){
        this.setName(name);
        this.setNocturnal(nocturnal);
        this.setWinged(winged);
        this.setNumberOfMembers(numberOfMembers);
    }
}
