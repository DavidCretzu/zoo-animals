package factory;

import model.*;
import constants.Animals;

public class FishFactory implements SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if(type.equalsIgnoreCase(Animals.Aquatic.PIKE)){
            return new Pike();
        } else if(type.equalsIgnoreCase(Animals.Aquatic.SEABASS)){
            return new SeaBass();
        } else if(type.equalsIgnoreCase(Animals.Aquatic.ZANDER)){
            return new Zander();
        } else {
            throw new IllegalArgumentException("Fish type " + type + " does not exist!");
        }
    }
}
