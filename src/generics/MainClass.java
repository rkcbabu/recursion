package generics;

/**
 *
 * @author Ram Chaulagai <ram.chaulagai.np@gmail.com>
 */
public class MainClass {

    public static void main(String args[]) {

        GenericClass<Integer> iObj = new GenericClass(88);
//        iObj.showType();
        System.out.println("value: " + iObj.getObj());

        
        
        
        GenericClass<String> strObj = new GenericClass("Generics Test");
//        strObj.showType();
        System.out.println("value: " + strObj.getObj());
        
        GenericClass<Float> float1 = new GenericClass(12.0F);
//        strObj.showType();
        System.out.println("value: " + float1.getObj());
        
        
        
    }
}
