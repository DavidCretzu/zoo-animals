package model;

public class Snake extends Reptile{

    public Snake(){
        this.setNumberOfMembers(0);
        this.setName("Snake");
        this.setScales(true);
        this.setShell(false);
    }

    public Snake(int numberOfMembers , String name , boolean scales , boolean shell){
        this.setNumberOfMembers(numberOfMembers);
        this.setName(name);
        this.setScales(scales);
        this.setShell(shell);
    }
}
