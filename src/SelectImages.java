import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;

public class SelectImages {
    public static void main(String[] args) {
        try {
            Connection c = ConnectionProvider.getConnection();

            String q = "insert into Images(pic) values (?)";

            java.sql.PreparedStatement pstmt = c.prepareStatement(q);

            JFileChooser jfc  = new JFileChooser();

            jfc.showOpenDialog(null);

            File file = jfc.getSelectedFile();

            FileInputStream fis = new FileInputStream(file);

            pstmt.setBinaryStream(1,fis,fis.available());

            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null,"Success...");

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
