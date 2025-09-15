package model;

public abstract class Animal {
    private int numberOfMembers;
    private String name;

    public String getName(){
        return name;
    }
    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }
    public void setName(String name){
        this.name = name;
    }
}
