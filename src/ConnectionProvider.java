import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    public static Connection con;

    public static Connection getConnection(){
        try {
            if(con==null){
                Class.forName("com.mysql.cj.jdbc.Driver");
                con= DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/newdata","root","root");
            }





        }catch (Exception e){
            System.out.println(e);
        }
        return con;
    }
}

