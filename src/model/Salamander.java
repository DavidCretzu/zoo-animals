package model;

public class Salamander extends Reptile {

    public Salamander(){
        this.setNumberOfMembers(4);
        this.setName("Salamander");
        this.setScales(false);
        this.setShell(false);
    }

    public Salamander(int numberOfMembers , String name , boolean scales , boolean shell){
        this.setNumberOfMembers(numberOfMembers);
        this.setName(name);
        this.setScales(scales);
        this.setShell(shell);
    }
}
