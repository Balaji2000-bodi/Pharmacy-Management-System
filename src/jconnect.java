
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dinesh
 */
public class jconnect {
    public static Connection connectDB(){
    Connection con=null;
        try {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/simi","simisrija","simisrija");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
    }
    
}
