package model;

public class Frog extends Reptile {

    public Frog(){
        this.setNumberOfMembers(4);
        this.setName("Frog");
        this.setScales(false);
        this.setShell(false);
    }

    public Frog(int numberOfMembers , String name , boolean scales , boolean shell){
        this.setNumberOfMembers(numberOfMembers);
        this.setName(name);
        this.setScales(scales);
        this.setShell(shell);
    }
}
