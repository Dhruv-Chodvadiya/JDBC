import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableRegistration {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/newdata","root","root");

            String sql = "CREATE TABLE REGISTRATION " +
                    "(id int(20) auto_increment, " +
                    " name VARCHAR(200) not null, " +
                    " city VARCHAR(200), " +
                    " PRIMARY KEY ( id ))";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");

            con.close();


        }catch (Exception e){
            System.out.println(e);
        }
    }
}
