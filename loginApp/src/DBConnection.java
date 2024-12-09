import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection connect() {
        try {
            String url = "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12750783";  // Change if using a remote database
            String user = "sql12750783";  // Database username
            String password = "VsLvUutl9l";  // Database password

            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (SQLException ex) {
            System.out.println("Database error: " + ex.getMessage());
            return null;
        }
    }
}
