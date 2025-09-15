package model;

public class Cockroach extends Insect {
    public Cockroach(){
        this.setName("Cockroach");
        this.setNocturnal(true);
        this.setWinged(true);
        this.setNumberOfMembers(6);
    }

    public Cockroach(int numberOfMembers , String name , boolean nocturnal, boolean winged){
        this.setName(name);
        this.setNocturnal(nocturnal);
        this.setWinged(winged);
        this.setNumberOfMembers(numberOfMembers);
    }
}
