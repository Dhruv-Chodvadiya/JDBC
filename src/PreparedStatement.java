
import java.sql.*;
import java.io.*;
public class PreparedStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/newdata", "root", "root");

            String q = "insert into REGISTRATION(name,city) values (?,?)";

            java.sql.PreparedStatement pstmt = con.prepareStatement(q);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter name : ");
            String name = br.readLine();

            System.out.print("Enter city : ");
            String city = br.readLine();

            pstmt.setString(1, name);
            pstmt.setString(2, city);

//            pstmt.setString(1,"harsh");
//            pstmt.setString(2,"goa");

            pstmt.executeUpdate();

            System.out.println("Inserted...");

            con.close();


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}