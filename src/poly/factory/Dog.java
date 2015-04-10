package poly.factory;

/**
 *
 * @author Ram Chaulagai <ram.chaulagai.np@gmail.com>
 */
public class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println(" I am a dog. I Bark!! ");
    }

//    ?@Override
    public static Animal getAnimal() {
        return new Dog();
    }
    
}
