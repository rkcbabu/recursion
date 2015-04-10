package composition;

import java.util.ArrayList;

/**
 *
 * @author Ram Chaulagai <ram.chaulagai.np@gmail.com>
 */
public class Company {

    String name;

    public Company(String name) {
        this.name = name;
    }


    public ArrayList<Department> getDepartments() {
        return departments;
    }

    private ArrayList<Department> departments = new ArrayList<>();

    public void addDepartment(String name) {
        Department department = new Department(this, name) ;
        departments.add(department);
    }

    void display() {
        System.out.println("Company Name : " + name);
        for (Department d : departments) {
            d.display();
        }
    }
}
