import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;

public class InsertImages {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/newdata","root","root");

            String q = "insert into Images(pic) values (?)";

            java.sql.PreparedStatement pstmt = con.prepareStatement(q);

            FileInputStream fis = new FileInputStream("C:\\Users\\PCCOM\\Desktop");

            pstmt.setBinaryStream(1,fis,fis.available());

            pstmt.executeUpdate();

            System.out.println("Done...");

            con.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
