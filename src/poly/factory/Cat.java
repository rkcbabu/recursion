package poly.factory;

/**
 *
 * @author Ram Chaulagai <ram.chaulagai.np@gmail.com>
 */
public class Cat implements Animal{

    @Override
     public void makeSound() {
        System.out.println(" I am a Cat. I Meow!! ");
    }

//    @Override
    public static Animal getAnimal() {
        return new Cat();
    }
    
}
