package model.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import model.config.DBConnect;
import model.entity.Cart;
import model.entity.Items;
import model.entity.Pet;
import model.entity.Product;
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

    public static String createOrder(Cart cart, User user) {
        try {
            Connection con = DBConnect.getConnection();
            String query = "insert into tblOrder values (?,?,?,?,?)";
            String orderID = getOrderId();
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, orderID);
            stmt.setString(2, Isvalid.getCurrentDate());
            stmt.setString(3, null);
            stmt.setString(4, user.getUserName());
            stmt.setString(5, "Đang xử lý");
            stmt.executeUpdate();
            con.close();
            createOrderDetail(cart, orderID);
            return orderID;
        } catch (Exception e) {
            System.out.println("Loi method createOrder(Cart cart, User user) trong OrderRepository.java ");

        }
        return null;
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

    public static ArrayList<Items> getOrder(String OrderId) {
        try {
            ArrayList<Items> orderedList = new ArrayList<>();
            Connection con = DBConnect.getConnection();
            String query = "select * from tblOrderDetail where OrderID = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, OrderId);
            ResultSet results = stmt.executeQuery();
            while (results.next()) {
                Items item = new Items();
                item.setAmmout(results.getInt(3));
                item.setProduct(getProductById(results.getString(2)));
                orderedList.add(item);
            }
            con.close();
            return orderedList;
        } catch (Exception e) {
            System.out.println("=============>ERROR :  ArrayList<Items> getOrder(String OrderId) <==============");
        }
        return null;
    }

    public static Product getProductById(String orderdetailId) {
        try {
            Connection con = DBConnect.getConnection();
            String query = (orderdetailId.contains("F")) ? "select * from tblFood where FoodID=?" : " select * from tblPet where PetID=?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, orderdetailId);
            ResultSet results = stmt.executeQuery();
            if (results.next()) {
                if (orderdetailId.contains("F")) {
                    String id = results.getString(1);
                    String name = results.getString(2);
                    double price = results.getDouble(4);
                    con.close();
                    return new Product(id, name, price);
                } else {
                    String id = results.getString(1);
                    String name = results.getString(2);
                    double price = results.getDouble(5);
                    con.close();
                    return new Product(id, name, price);
                }
            }
            con.close();
            return null;

        } catch (Exception e) {
            System.out.println("=========>ERROR :getProductById(String orderdetailId) <===========");
        }
        return null;
    }

    public static String getOrderStatus(String orderId) {
        String id = null;
        try {
            Connection con = DBConnect.getConnection();
            String query = "select OrderStatus from tblOrder where OrderID = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, orderId);
            ResultSet results = stmt.executeQuery();
            if (results.next()) {
                id = results.getString(1);
            }
            con.close();
        } catch (Exception e) {
            System.out.println("==========>ERROR : getOrderStatus()<=============");
        }
        return id;
    }

    public static ArrayList<String> getOrderIdList(String userId) {
        ArrayList<String> listOrderId = new ArrayList<>();
        try {
            Connection con = DBConnect.getConnection();
            String query = "select OrderId from tblOrder where UserName = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, userId);
            ResultSet results = stmt.executeQuery();
            while (results.next()) {
                listOrderId.add(results.getString(1));
            }
            con.close();
        } catch (Exception e) {
            System.out.println("==========>ERROR : getOrderIdList(String userId)<=============");
        }
        return listOrderId;
    }

    public static String getOrderDate(String orderId) {
        String date = null;
        try {
            Connection con = DBConnect.getConnection();
            String query = "select OrDate from tblOrder where OrderID= ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, orderId);
            ResultSet results = stmt.executeQuery();
            if (results.next()) {
                date =  results.getString(1);
            }
            con.close();
        } catch (Exception e) {
            System.out.println("==========>ERROR : getOrderStatus()<=============");
        }
        return date;
    }
}
