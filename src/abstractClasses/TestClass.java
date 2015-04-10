package abstractClasses;

/**
 *
 * @author Ram Chaulagai <ram.chaulagai.np@gmail.com>
 */
public class TestClass {
    public static void main(String[] args) {
        Triangle t = new Triangle("Mero Triangle", 12.12, 34.34);
        t.detailsTemplate();
        
        Circle c = new Circle("my Circle", 12.12);
        c.detailsTemplate();
    }
}
