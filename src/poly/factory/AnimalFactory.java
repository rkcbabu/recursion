package poly.factory;

/**
 *
 * @author Ram Chaulagai <ram.chaulagai.np@gmail.com>
 */
public class AnimalFactory {
    static Animal getAnimal(String animalType){
        switch(animalType) {
            case "cat": return new Cat();
            case "dog": return new Dog();
            default : 
                return null;
        }
        
    }
}
