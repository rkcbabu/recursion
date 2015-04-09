package generics;

/**
 *
 * @author Ram Chaulagai <ram.chaulagai.np@gmail.com>
 */
public class GenericHander<T extends Object> {

    T obj;

    public GenericHander(T obj) {
        this.obj = obj;
    }

    void print() {
        System.out.println(obj);
    }
}
