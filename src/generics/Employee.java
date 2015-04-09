package generics;

/**
 *
 * @author Ram Chaulagai <ram.chaulagai.np@gmail.com>
 */
public class Employee implements Person {
    String name; 

    public Employee(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name; 
    }
    
}
