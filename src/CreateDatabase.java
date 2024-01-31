import java.sql.Connection;
import java.sql.DriverManager;

public class CreateDatabase {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/newdata","root","root");
            if(con.isClosed()){
                System.out.println("closed");
            }else {
                System.out.println("opan");
            }

        } catch(Exception e){
            System.out.println(e);
        }
    }
}