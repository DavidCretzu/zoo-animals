package factory;

import model.Animal;

public interface SpeciesFactory {
    Animal getAnimal(String type);
}
