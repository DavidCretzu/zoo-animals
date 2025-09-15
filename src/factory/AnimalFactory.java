package factory;

public class AnimalFactory {

    public SpeciesFactory getSpeciesFactory(String type) {
        if(type.equalsIgnoreCase("Mammal")){
            return new MammalFactory();
        } else if(type.equalsIgnoreCase("Reptile")){
            return new ReptileFactory();
        } else if(type.equalsIgnoreCase("Insect")){
            return new InsectFactory();
        } else if(type.equalsIgnoreCase("Fish")){
            return new FishFactory();
        } else {
            throw new IllegalArgumentException("Species type " + type + " does not exist!");
        }
    }
}
