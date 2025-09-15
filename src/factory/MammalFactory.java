package factory;

import model.*;
import constants.Animals;

public class MammalFactory implements SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if(type.equalsIgnoreCase(Animals.Mammal.LION)){
            return new Lion();
        } else if(type.equalsIgnoreCase(Animals.Mammal.TIGER)){
            return new Tiger();
        } else if(type.equalsIgnoreCase(Animals.Mammal.RHINO)){
            return new Rhino();
        } else {
            throw new IllegalArgumentException("Mammal type " + type + " does not exist!");
        }
    }
}
