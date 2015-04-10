package singleton;

/**
 *
 * @author Ram Chaulagai <ram.chaulagai.np@gmail.com>
 */
public class TestClass {
    public static void main(String[] args) {
//        DBConnection dbc = new DBConnection();
        DBConnection dbc = DBConnection.getDBConnection();
        dbc.print();
        
    }
}
