package abstractClasses;

/**
 *
 * @author Ram Chaulagai <ram.chaulagai.np@gmail.com>
 */
public class Circle extends Shape{
    double r ; 
    public Circle(String name, double r) {
        super(name);
        this.r = r; 
    }

    @Override
    void draw() {
        System.out.println("I am "+name);
    }

    @Override
    double calculateArea() {
        return r*r * Math.PI;
    }
    
}
