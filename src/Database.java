import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static Connection conn = null;

    private Database(){}

    public static Connection getConnection() {
        if (conn == null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/Fudbal",
                        "root",
                        "1234");

            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

        return conn;
    }
}