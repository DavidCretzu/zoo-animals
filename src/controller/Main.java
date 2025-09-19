package controller;

import factory.*;
import model.Animal;
import constants.Animals;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory(); // cream obiect AnimalFactory

        SpeciesFactory mammalFactory = animalFactory.getSpeciesFactory("Mammal");
        Animal tiger = mammalFactory.getAnimal(Animals.Mammal.TIGER);
        System.out.println("Created " + tiger.getName());

        SpeciesFactory fishFactory = animalFactory.getSpeciesFactory("Fish");
        Animal pike = fishFactory.getAnimal(Animals.Aquatic.PIKE);
        System.out.println("Created" + pike.getName());

        SpeciesFactory reptileFactory = animalFactory.getSpeciesFactory("Reptile");
        Animal salamander = reptileFactory.getAnimal(Animals.Reptile.SALAMANDER);
        System.out.println("Created " + salamander.getName());
    }
}
