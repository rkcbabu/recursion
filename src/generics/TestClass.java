package generics;

/**
 *
 * @author Ram Chaulagai <ram.chaulagai.np@gmail.com>
 */
public class TestClass {

    public static void main(String[] args) {
        GenericHander<Manager> mGeneric = new GenericHander(new Manager("ABc"));
        mGeneric.print();
        
        GenericHander<Employee> e = new GenericHander("Employee1");
        e.print();
    }
}
