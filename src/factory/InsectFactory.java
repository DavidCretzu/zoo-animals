package factory;

import model.*;
import constants.Animals;

public class InsectFactory implements SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if(type.equalsIgnoreCase(Animals.Insect.SPIDER)){
            return new Spider();
        } else if(type.equalsIgnoreCase(Animals.Insect.COCKROACH)){
            return new Cockroach();
        } else if(type.equalsIgnoreCase(Animals.Insect.BUTTERFLY)){
            return new Butterfly();
        } else {
            throw new IllegalArgumentException("Insect type " + type + " does not exist!");
        }
    }
}
