package composition;

/**
 *
 * @author Ram Chaulagai <ram.chaulagai.np@gmail.com>
 */
public class Test {

    public static void main(String[] args) {
        Company c = new Company("Vastika1");
        c.addDepartment("Accounting ");
        c.addDepartment("Oppertunity Allocation ");
        c.addDepartment("Human resource ");
        c.display();
        
        Company c1 = new Company("Another");
        c1.addDepartment("Accounting ");
        c1.addDepartment("Oppertunity Allocation ");
        c1.addDepartment("Human resource ");
        c1.display();
    }
}
