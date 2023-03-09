/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public interface DBConnect {
    
    public static String serverName = "LAPTOP-7UOA152U\\SQLEXPRESS";
    public static String dbName = "PetshopDB";
    public static String portNumber = "1433";
    public static String userID = "sa";
    public static String password = "kungkimp3";

    public static Connection getConnection() {
        try {
            String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(url, userID, password);
        } catch (Exception e) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

//    Test connection
    public static void main(String[] args) {
        try {
            if (DBConnect.getConnection() != null) {
                System.out.println("Connect successfully!");
            } else {
                System.out.println("Connect failed!");
            }
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("Error at model.DBContext.DBContext().getConnertion()");
        }
    }
    public static int register(String username,String password,String fullname,String age,String email,String phone,String address) {
        try {
            Connection con = DBConnect.getConnection();
            PreparedStatement stmt=con.prepareStatement("insert into tblUser values(?,?,?,?,?,?,?,?)");
            int ageInt = Integer.parseInt(age);
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.setString(3, fullname);
            stmt.setInt(4, ageInt);
            stmt.setString(5, email);
            stmt.setString(6, phone);
            stmt.setString(7, address);
            stmt.setString(8, "user");
            return stmt.executeUpdate(); //tra ve so hang bi anh huong?
                         
        } catch (Exception e) {
            System.out.println("Loi Database method register trong DBConnect");
            return 0;
        }


}
}

