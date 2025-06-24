/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework;

import java.sql.*;
import javax.swing.*;

public class dbcon {

    private static final String URL = "jdbc:mysql://localhost:3306/education_plat";
    private static final String USER = "root";
    private static final String PASS = ""; // Update with your MySQL password

    public Connection open() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            return conn;
        } catch (Exception e) {
            System.out.println("Connection failed: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Failed to connect to database", "ERROR", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void close(Connection con) {
        try {
            if (con != null) con.close();
        } catch (Exception e) {
            System.out.println("Connection still on: " + e.getMessage());
        }
    }
}