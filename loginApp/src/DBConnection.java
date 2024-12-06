import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection connect() {
        try {
            String url = "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12749143";  // Change if using a remote database
            String user = "sql12749143";  // Database username
            String password = "3MtUcBcFDG";  // Database password

            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (SQLException ex) {
            System.out.println("Database error: " + ex.getMessage());
            return null;
        }
    }
}
