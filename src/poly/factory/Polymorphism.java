package poly.factory;

/**
 *
 * @author Ram Chaulagai <ram.chaulagai.np@gmail.com>
 */
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal animal = AnimalFactory.getAnimal("cat");
        animal.makeSound();
        animal = AnimalFactory.getAnimal("dog");
        animal.makeSound();
    }
    
}
