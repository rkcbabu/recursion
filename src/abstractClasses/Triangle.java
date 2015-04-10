package abstractClasses;

/**
 *
 * @author Ram Chaulagai <ram.chaulagai.np@gmail.com>
 */
public class Triangle extends Shape {

    double height, base;

    public Triangle(String name, double height, double base) {
        super(name);
        this.height = height;
        this.base = base;
    }

    @Override
    double calculateArea() {
        return height * base / 2;
    }

    @Override
    void draw() {
        System.out.println("Drawing of shape is "+name);
    }

}
