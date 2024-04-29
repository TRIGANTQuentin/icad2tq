/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icad2admin.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author q.trigand
 */
public class MySQLConnection {

    private static final String url = "jdbc:mysql://172.28.36.15/icad";
    private static final String user = "quentin";
    private static final String pass = "abzXea82*";

    private static Connection con = null;

    public static Connection getConnexion() {
        if (con == null) {
            try {
               
                con = DriverManager.getConnection(url, user, pass);
            } catch (Exception ex) {
                Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return con;
    }
}
