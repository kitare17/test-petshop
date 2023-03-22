/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.config.DBConnect;
import model.entity.Food;
import model.entity.Pet;
import model.entity.Service;

/**
 *
 * @author PC
 */
public class AdminRepository {

    public static int getAmountUser() {
        try {
            String query = "select count(1) from tblUser";
            Connection con = DBConnect.getConnection();
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet results = stmt.executeQuery();
            if (results.next()) {
                return results.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("Loi method getAmountUser() trong AdminRepository .java ");
        }
        return 0;
    }

    public static int getCustomerOrder() {
        try {
            String query = "  select count( distinct UserName) from tblOrder";
            Connection con = DBConnect.getConnection();
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet results = stmt.executeQuery();
            if (results.next()) {
                return results.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("Loi method getCustomerOrder() trong AdminRepository .java ");
        }
        return 0;
    }

    public static ArrayList<Pet> getAllPet() {
        ArrayList<Pet> listPet = null;
        try {
            String query = "  select * from tblPet";
            Connection con = DBConnect.getConnection();
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet results = stmt.executeQuery();
            listPet = new ArrayList<>();
            while (results.next()) {
                String productId = results.getString(1);
                String productName = results.getString(2);
                String petColor = results.getString(3);
                String productType = results.getString(4);
                double productPrice = Double.parseDouble(results.getString(5));
                int productAmount = Integer.parseInt(results.getString(6));
                Pet pet=new Pet(productId, productName, productType, productPrice, productAmount, petColor);
                listPet.add(pet);
            }

        } catch (Exception e) {
            System.out.println("Loi method getAllPet() trong AdminRepository .java ");
        }
        return listPet;
    }
    public static ArrayList<Food> getAllFood() {
        ArrayList<Food> listFood = null;
        try {
            String query = "  select * from tblFood";
            Connection con = DBConnect.getConnection();
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet results = stmt.executeQuery();
            listFood = new ArrayList<>();
            while (results.next()) {
                String productId = results.getString(1);
                String productName = results.getString(2);
                String productType = results.getString(3);
                double productPrice = Double.parseDouble(results.getString(4));
                int productAmount = Integer.parseInt(results.getString(5));
                Food food =new Food(productId, productName, productType, productPrice, productAmount);
                listFood.add(food);
            }

        } catch (Exception e) {
            System.out.println("Loi method getAllFood() trong AdminRepository .java ");
        }
        return listFood;
    }

    public static boolean removeProduct(String idProduct) {
        try {
            Connection con = DBConnect.getConnection();
            String discount = null;
            String query = (idProduct.contains("F")) ? "delete tblFood where FoodID=?" : " delete tblPet where PetID=?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, idProduct);
            stmt.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Loi method removeProduct(String idProduct) trong ProductRepository.java ");
            e.printStackTrace();
        }

        return false;
    }

    public static boolean addPet(Pet pet) {
        try {
//         insert into tblOrder values ('123','2022-12-12',null,'antunglam985',1)
            Connection con = DBConnect.getConnection();
            String discount = null;
            String query = "insert into tblPet values (?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, pet.getProductId());
            stmt.setString(2, pet.getProductName());
            stmt.setString(3, pet.getPetColor());
            stmt.setString(4, pet.getProductType());
            stmt.setDouble(5, pet.getProductPrice());
            stmt.setInt(6, pet.getProductAmount());
            stmt.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Loi method removeProduct(String idProduct) trong ProductRepository.java ");
            e.printStackTrace();
        }

        return false;
    }

    public static boolean addFood(Food food) {
        try {
//         insert into tblOrder values ('123','2022-12-12',null,'antunglam985',1)
            Connection con = DBConnect.getConnection();
            String discount = null;
            String query = " insert into tblFood values(?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, food.getProductId());
            stmt.setString(2, food.getProductName());
            stmt.setString(3, food.getProductType());
            stmt.setDouble(4, food.getProductPrice());
            stmt.setInt(5, food.getProductAmount());
            stmt.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Loi method removeProduct(String idProduct) trong ProductRepository.java ");
            e.printStackTrace();
        }

        return false;
    }

    public static boolean addService(Service service) {
        try {
            Connection con = DBConnect.getConnection();
            String query = " insert into tblService values(?,?,?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, service.getServiceID());
            stmt.setString(2, service.getServiceName());
            stmt.setDouble(3, service.getServicePrice());
            stmt.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Loi method addService(Service service) trong ProductRepository.java ");
            e.printStackTrace();
        }

        return false;
    }

    public static void main(String[] args) {
         ArrayList<Food> listPet=AdminRepository.getAllFood();
        for (Food pet : listPet) {
            System.out.println(pet);
        }

    }
}
