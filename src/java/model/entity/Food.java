/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

/**
 *
 * @author PC
 */
public class Food extends Product{

    public Food() {
    }

    public Food(String productId, String productName, String productType, double productPrice, int productAmount) {
        super(productId, productName, productType, productPrice, productAmount);
    }
    
}
