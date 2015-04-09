package generics;

/**
 *
 * @author Ram Chaulagai <ram.chaulagai.np@gmail.com>
 */
class GenericClass <T1> {

    T1 obj1;
//    T2 obj2; 

    GenericClass(T1 o) {
        obj1 = o;
    }
//    GenericClass(T1 o, T2 o2) {
//        obj1 = o;
//        obj2 = o2;
//    }

    T1 getObj() {
        return obj1;
    }

    void showType() {
        System.out.println("Type of T is " + obj1.getClass().getName());
    }
}
