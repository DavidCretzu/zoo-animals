package factory;

import model.Animal;

public class InsectFactory implements Factory {
    public Animal makeAnimal()
    {
       System.out.println("InsectFactory.makeAnimal()");
       return makeAnimal();
    }
}
