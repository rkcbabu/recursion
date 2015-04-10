package singleton;

/**
 *
 * @author Ram Chaulagai <ram.chaulagai.np@gmail.com>
 */
public class DBConnection {

    private String url = "URL:PORT", username = "username", password = "password";

    private DBConnection() {
    }

    private static DBConnection dbc;

    public static DBConnection getDBConnection() {
        if (dbc == null) {
            dbc = new DBConnection();
        }
        return dbc;
    }

    void print() {
        System.out.println("URL :" + url + " username:" + username + " password:" + password);
    }
}
