package abstractClasses;

/**
 *
 * @author Ram Chaulagai <ram.chaulagai.np@gmail.com>
 */
abstract class Shape {
//    Double area ; // shape has some area ;

    String name; // imagery ; 

    public Shape(String name) {
        this.name = name;
    }

    // abstract method ; 
    abstract void  draw();
    
    // abstract method ; 
    abstract double calculateArea();

    // tempate method 
    void detailsTemplate() {
        System.out.println("Name of shape is " + name);
        System.out.println("Calculated Area: " + calculateArea());
        draw();
    }

}
