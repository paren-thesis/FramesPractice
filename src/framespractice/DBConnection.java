/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framespractice;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Prosper
 */
public class DBConnection {

    public static void main(String[] args) {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String dbpath = "jdbc:derby://localhost:1527/BICT212";
            Connection con = DriverManager.getConnection(dbpath, "sa", "1234");
            Statement st = con.createStatement();
            //CREATE TABLE
           /**String qry = "CREATE TABLE login (indexNo CHAR(10) PRIMARY KEY, "
                    + "Username varchar(50), Password VARCHAR(30))";
            st.execute(qry);
            JOptionPane.showMessageDialog(null, "Table created");**/
            
            String qry = "INSERT INTO login values('0323419001', 'Test', '@1234?@')";
            st.execute(qry);
            JOptionPane.showMessageDialog(null, "Record added");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

}
