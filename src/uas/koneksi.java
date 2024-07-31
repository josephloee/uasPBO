/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package uas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Database Connection Class
 * 
 * @author asus
 */
public class koneksi {
    public static Connection getKoneksi(){
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/uas_jo", "root", "");
            //JOptionPane.showMessageDialog(null, "Koneksi Sukses");
            return con;
        }catch(SQLException ex){
            java.util.logging.Logger.getLogger(penjualan.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}