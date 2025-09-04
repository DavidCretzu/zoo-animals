package model;

public abstract class Animal {
    private int number_of_legs;
    private String name;

    public String getName(){
        return name;
    }
    public int number_of_legs(){
        return number_of_legs;
    }
}
