package factory;

import model.*;
import constants.Animals;

public class ReptileFactory implements SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if(type.equalsIgnoreCase(Animals.Reptile.SNAKE)){
            return new Snake();
        } else if(type.equalsIgnoreCase(Animals.Reptile.FROG)){
            return new Frog();
        } else if(type.equalsIgnoreCase(Animals.Reptile.SALAMANDER)){
            return new Salamander();
        } else {
            throw new IllegalArgumentException("Reptile type " + type + " does not exist!");
        }
    }
}
