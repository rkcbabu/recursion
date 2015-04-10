package composition;

/**
 *
 * @author Ram Chaulagai <ram.chaulagai.np@gmail.com>
 */
public class Department {

    Company company;
    String name;

    private Department() {
    }

    public Department(Company company, String name) {
        this.company = company;
        this.name = name;
    }

    void display() {
        System.out.println("\tDepartment Name : " + name);
    }
}
