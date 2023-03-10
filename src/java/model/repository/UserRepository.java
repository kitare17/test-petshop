/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.config.DBConnect;
import model.entity.User;

/**
 *
 * @author PC
 */
public class UserRepository {
    public static boolean checkUserNameExist(String username) {
        try {
            Connection con = DBConnect.getConnection();
             PreparedStatement stmt=con.prepareStatement("select * from tblUser  where UserName =?");
             stmt.setString(1, username);
             ResultSet resultSet = stmt.executeQuery();
             return resultSet.next();
              
        } catch(Exception e) {
            System.out.println("loi checkUserNameExsit(String userName)");
            e.printStackTrace();
        }
        return false;
    }
    public static int register(User user) {
        try {
            Connection con = DBConnect.getConnection();
            PreparedStatement stmt=con.prepareStatement("insert into tblUser values(?,?,?,?,?,?,?,?)");
            stmt.setString(1, user.getUserName());
            stmt.setString(2,  user.getUserPass());
            stmt.setString(3, user.getUserFullName());
            stmt.setInt(4, user.getUserAge());
            stmt.setString(5, user.getUserEmail());
            stmt.setString(6, user.getUserPhone());
            stmt.setString(7, user.getUserAdress());
            stmt.setString(8, user.getUserRole());
            return stmt.executeUpdate(); //tra ve so hang bi anh huong?
                         
        } catch (Exception e) {
            System.out.println("Loi Database method register trong DBConnect");
            return 0;
        }
}
}
