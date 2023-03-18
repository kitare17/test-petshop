package model.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.config.DBConnect;
import model.entity.Cart;
import model.entity.Items;
import model.entity.Pet;
import model.entity.User;
import model.service.Isvalid;
import model.service.RandomGenerator;

/**
 *
 * @author quang
 */
public class OrderRepository {

    public static String getOrderId() {
        try {
            String OrderId = RandomGenerator.generateRandomString();
            String query = "select OrderID from tblOrder";
            Connection con = DBConnect.getConnection();
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet results = stmt.executeQuery();
            ArrayList<String> listOrderID = new ArrayList<>();
            while (results.next()) {
                String OrderIdDB = results.getString(1);
                listOrderID.add(OrderIdDB);
            }
            for (String oDB : listOrderID) {
                if (oDB.equals(OrderId)) {
                    OrderId = RandomGenerator.generateRandomString();
                }
            }
            return OrderId;
        } catch (Exception e) {
            System.out.println("Loi method checkExistOrder(Cart cart ) trong OrderRepository.java ");
        }
        return null;
    }

    public static boolean createOrder(Cart cart, User user) {
        try {
            Connection con = DBConnect.getConnection();
            String query = "insert into tblOrder values (?,?,?,?,?)";
            String orderID = getOrderId();
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, orderID);
            stmt.setString(2, Isvalid.getCurrentDate());
            stmt.setString(3, null);
            stmt.setString(4, user.getUserName());
            stmt.setBoolean(5, false);
            stmt.executeUpdate();
            con.close();
            createOrderDetail(cart, orderID);
            return true;
        } catch (Exception e) {
            System.out.println("Loi method createOrder(Cart cart, User user) trong OrderRepository.java ");

        }
        return false;
    }

    public static boolean createOrderDetail(Cart cart, String orderId) {
        for (Items i : cart.getCart()) {
            try {
                Connection con = DBConnect.getConnection();
                String query = "insert into tblOrderDetail values (?,?,?)";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setString(1, orderId);
                stmt.setString(2, i.getProduct().getProductId());
                stmt.setInt(3, i.getAmmout());
                stmt.executeUpdate();
                con.close();
            } catch (Exception e) {
                System.out.println("Loi method createOrderDetail(Cart cart,String orderId) trong OrderRepository.java ");

            }
        }
        return true;
    }
}
