import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SelectDatabase {
    static final String DB_URL = "jdbc:mysql://localhost:3306/STUDENTS";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        System.out.println("Connecting to a selected database...");

        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {

            System.out.println("Connected database successfully...");

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }
}
