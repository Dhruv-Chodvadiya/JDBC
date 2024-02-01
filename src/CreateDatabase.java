import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDatabase {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/","root","root");
            Statement stmt = con.createStatement();
            String sql = "CREATE DATABASE STUDENTS";
            stmt.executeUpdate(sql);

            if(con.isClosed()){
                System.out.println("closed");
            }else {
                System.out.println("Create Students Database");
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }
}